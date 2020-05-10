package com.gh.controller;

import com.gh.entity.Product;
import com.gh.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author GuoHui
 * @Date 2020/4/9
 */

@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("list")
    public String list(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        if(cookies.length>0){
            for (Cookie cookie:cookies) {
                System.out.println(cookie.getName());
                System.out.println(cookie.getPath());
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("sessionToken","898989");
        String id = session.getId();
        System.out.println(id);

        Cookie cookie=new Cookie("token","123456789");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(365 * 24 * 60 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return indexService.list();
    }
}

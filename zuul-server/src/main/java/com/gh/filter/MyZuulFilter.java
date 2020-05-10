package com.gh.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author GuoHui
 * @Date 2020/4/10
 */
@Component
public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
//        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rct=RequestContext.getCurrentContext();
        HttpServletRequest request = rct.getRequest();
        String token = request.getParameter("token");
        if(token==null){
            rct.setSendZuulResponse(false);
            try {
                rct.getResponse().getWriter().write("Token is null...");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}

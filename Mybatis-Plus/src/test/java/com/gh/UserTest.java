package com.gh;

import com.gh.dao.UserMapper;
import com.gh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author GuoHui
 * @Date 2020/4/17
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void v1(){
        User user = userMapper.selectById("1087982257332887553");
        System.out.println(user.toString());
        List<User> users = userMapper.selectList(null);

        users.forEach(User-> System.out.println(user.toString()));
        User us=new User();
        us.setAge(20);
//        us.setId(5656131546541L);
//        System.out.println(us.getId());
        us.setCreateTime(LocalDateTime.now());
        us.setEmail("1351652209@qq.com");
        us.setManagerId(1088250446457389058L);
        int insert = userMapper.insert(us);
        System.out.println("insert:>>>>"+insert);

    }

    @Test
    public  void  v2(){
//        LocalDate localDate = LocalDate.now();
//        System.out.println(LocalDate.now());
//        int year = localDate.getYear();
//        System.out.println(year);
//
//        int year1 = localDate.get(ChronoField.YEAR);
//        System.out.println(year1);
//
//        Month month = localDate.getMonth();
//        System.out.println(month);
//
//        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
//        System.out.println(month1);
//
//        int day = localDate.getDayOfMonth();
//        System.out.println(day);
//
//        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
//        System.out.println(day1);
//
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//        System.out.println(dayOfWeek);
//
//        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
//        System.out.println(dayOfWeek1);


//        LocalTime localTime = LocalTime.of(13, 51, 10);
//        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        //自定义格式化
        DateTimeFormatter dateTimeFormatter =   DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s3 = localDateTime.format(dateTimeFormatter);
        System.out.println(s3);
    }

}

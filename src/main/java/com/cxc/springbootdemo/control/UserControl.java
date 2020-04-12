package com.cxc.springbootdemo.control;

import com.cxc.springbootdemo.model.User;
import com.cxc.springbootdemo.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userControl")
public class UserControl {

    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        User user = new User(1,"张三",18);
        return new JsonResult<>(user);
    }

    @RequestMapping("/userList")
    public JsonResult<List<User>> getUserList(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"张三",16));
        list.add(new User(2,"张四",17));
        list.add(new User(3,"张五",18));
        //这里的null会被fastJson转成""
        list.add(new User(4,null,19));

        return new JsonResult<>(list);
    }

    @RequestMapping("/userMap")
    public JsonResult<Map> getUserMap(){
        User user = new User(1,"张六",20);
        Map<String,Object> map = new HashMap<>(4);
        map.put("作者信息",user);
        map.put("粉丝数量",18000);
        map.put("活跃时间","2020-04-12 10:00");
        map.put("获得荣誉",null);
        return new JsonResult<>(map,"获取用户信息成功");
    }
}

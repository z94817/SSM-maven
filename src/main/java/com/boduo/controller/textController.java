package com.boduo.controller;

import com.boduo.inter.textService;
import com.boduo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@RestController
public class textController {

    @Autowired
    private textService ts;

    @RequestMapping("waha")
    public void go(HttpServletRequest req, HttpServletResponse rep) {
        System.out.println("进入ctrl");
        User go = ts.go();
        try {
            rep.getWriter().print(go.getId() + "--" + go.getUsername() + "--" + go.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("出ctrl");
    }
}

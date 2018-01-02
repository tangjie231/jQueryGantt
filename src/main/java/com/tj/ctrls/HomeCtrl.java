package com.tj.ctrls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:jie.tang on 2018-01-02 15:53
 * desc:
 */
@RestController
public class HomeCtrl {

    @ResponseBody
    @RequestMapping("/home")
    public String getHome(){
        return "hello";
    }
}

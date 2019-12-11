package com.chen.web;

import com.chen.anno.Chen;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author:
 */
@Controller
public class TestController {

    @Chen
    public String test(){
        System.err.println("web===test....");
        return "11";
    }

    public void test1() throws Exception{
        System.err.println("111111111web===test....");
        throw new Exception("");
    }


    public void test2(String name) {
        System.err.println("name==="+name);
    }
}

package com.example.homework2.controller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/demo_ab")
public class RestController{
    @RequestMapping(value = "/sum1", method = RequestMethod.GET)
    public Integer index(@RequestParam("a") Integer a, @RequestParam("b")Integer b) {
        int sum = a + b;
        System.out.println("a = "+a+",b = " +b+",a + b ="+sum);
        return sum;
    }
}
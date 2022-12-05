package com.example.homework2.controller1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/demo_ab")
public class RestController{
    @RequestMapping(value = "/sum1", method = RequestMethod.GET)
    public Integer index1(@RequestParam("a") Integer a, @RequestParam("b")Integer b) {
        int sum1 = a + b;
        System.out.println("a = "+a+",b = " +b+",a + b ="+sum1);
        return sum1;
    }
    @RequestMapping("/sum2/{a}/{b}")
    public Integer index2(@PathVariable("a") Integer a, @PathVariable("b")Integer b) {
        int sum2 = a + b;
        System.out.println("a = "+a+",b = " +b+",a + b ="+sum2);
        return sum2;
    }
}
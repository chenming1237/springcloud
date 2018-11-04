package com.cm.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/cm/")
public class TestController {

    @Autowired
    RestTemplate restTemplate;



    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}
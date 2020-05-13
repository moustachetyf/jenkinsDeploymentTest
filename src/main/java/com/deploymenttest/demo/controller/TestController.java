package com.deploymenttest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tian yunfeng
 * @date 2020-05-13
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test () {
        return "现在时间是 ———————— 18：17";
    }

}

package com.kian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaojian
 * @date 2022-04-13 15:08:16
 * @description
 */
@RestController
@RequestMapping("/docker")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping
    public String demo() {
        log.info("hello springboot-docker!");
        return "hello springboot-docker";
    }

}

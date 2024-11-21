package uz.kiverak.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @Value("${tmpVar}")
    private String tmpVar;

    @GetMapping("/test")
    public String test() {
        return "id = " + id + ", tmpVar = " + tmpVar;
    }
}

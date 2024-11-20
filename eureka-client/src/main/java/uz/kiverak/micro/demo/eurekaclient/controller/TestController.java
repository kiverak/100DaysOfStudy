package uz.kiverak.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

package uz.kiverak.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/new")
public class NewController {

    @GetMapping("/name")
    public String name() {
        return "Hello world";
    }
}

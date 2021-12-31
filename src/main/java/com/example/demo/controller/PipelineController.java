package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PipelineController {
    @GetMapping
    public String helloPipeline(){
        return "Hello Azure PipeLine Integration with Repo";
    }
}

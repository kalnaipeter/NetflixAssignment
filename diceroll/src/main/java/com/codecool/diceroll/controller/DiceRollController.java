package com.codecool.diceroll.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/video")
public class DiceRollController {

    @GetMapping("/1")
    public Video video1(){
        return new Video(
                1,
                "video1",
                "www.video1.com"
        );
    }

    @Data
    @AllArgsConstructor
    public class Video{
        private int id;
        private String name;
        private String url;
    }
}

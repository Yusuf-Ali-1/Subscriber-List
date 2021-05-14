package com.tts.week13day5.controller;


import com.tts.week13day5.model.Subscriber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriberController {

    @GetMapping(value = "/")
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }
}
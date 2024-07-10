package com.vamte.domain.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "asdfsdf";
    }
}

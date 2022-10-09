package com.LeeDiculous.project.loginservice.domain.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Layout {

    @GetMapping("/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }
}

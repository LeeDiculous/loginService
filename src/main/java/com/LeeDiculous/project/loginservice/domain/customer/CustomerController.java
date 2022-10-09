package com.LeeDiculous.project.loginservice.domain.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    @GetMapping("/login")
    public String loginForm() {

        return "login/loginForm";
    }

    @PostMapping("/login")
    public String loginForm(@ModelAttribute Customer customer, Model model) {
        model.addAttribute(customer);
        return "login/loginHome";
    }
}

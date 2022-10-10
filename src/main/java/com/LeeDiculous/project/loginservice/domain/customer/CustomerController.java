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

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String loginForm(@ModelAttribute Login login) {
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String loginForm(@ModelAttribute Login login, Model model) {
        log.info("고객의 이메일은 {} 비밀번호는 {}", login.getLoginId(), login.getLoginPassword());
        return "login/loginHome";
    }

    @GetMapping("/new")
    public String newCustomer() {
        return "login/newCustomer";
    }

    @PostMapping("/new")
    public String newCustomer(@ModelAttribute Customer customer) {
        return "redirect:/login";
    }
}

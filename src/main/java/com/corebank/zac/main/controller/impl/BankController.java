package com.corebank.zac.main.controller.impl;

import com.corebank.zac.main.controller.IBankController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController implements IBankController {
    @Value("${spring.application.name}")
    String appName;

    @Override
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName",appName);
        return "home";
    }
}

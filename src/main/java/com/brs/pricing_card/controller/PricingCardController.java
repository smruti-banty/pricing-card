package com.brs.pricing_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.brs.pricing_card.service.PricingCardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PricingCardController {
    private final PricingCardService service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("cards", service.getCards());
        return "index";
    }
}

package com.brs.pricing_card.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PricingCard {
    private String title;
    private String subTitle;
    private int price;
    private List<String> features;
}

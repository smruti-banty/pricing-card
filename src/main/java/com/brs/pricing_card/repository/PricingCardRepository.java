package com.brs.pricing_card.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.brs.pricing_card.model.PricingCard;

@Repository
public class PricingCardRepository {
    public PricingCard card1() {
        return new PricingCard("Basic Plan", "Suitable for small projects", 29,
                List.of("5 GB Storage", "Basic Support", "Limited Features"));
    }

    public PricingCard card2() {
        return new PricingCard("Pro Plan", "Great for medium-sized businesses", 79,
                List.of("20 GB Storage", "Priority Support"));
    }

    public PricingCard card3() {
        return new PricingCard("Enterprise Plan", "Best for large enterprises", 199,
                List.of("Unlimited Storage", "24/7 Premium Support", "Full Access to Features"));
    }
}

package com.brs.pricing_card.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brs.pricing_card.model.PricingCard;
import com.brs.pricing_card.repository.PricingCardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PricingCardService {
    private final PricingCardRepository repository;

    public List<PricingCard> getCards() {
        return List.of(repository.card1(), repository.card2(), repository.card3());
    }
}

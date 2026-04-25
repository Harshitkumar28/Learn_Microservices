package com.learnms.cards.service.impl;

import com.learnms.cards.constants.CardsConstants;
import com.learnms.cards.entity.Cards;
import com.learnms.cards.exception.CardAlreadyExistsException;
import com.learnms.cards.repository.CardsRepository;
import com.learnms.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class CardsServiceImpl implements ICardsService {

    private CardsRepository cardsRepository;

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    @Override
    public void createCard(String mobileNumber) {
        Optional<Cards> optionalCards = cardsRepository.findByMobileNumber(mobileNumber);

        // write exception handling logic
        if(optionalCards.isPresent()) {
            throw new CardAlreadyExistsException("Card already registered with given mobileNumber"+ mobileNumber);
        }

        cardsRepository.save(createNewCard((mobileNumber)));
    }

    /**
     *
     * @param mobileNumber
     * @return the new card details
     */
    private Cards createNewCard(String mobileNumber) {
        Cards card = new Cards();

        long randomCardNumber = 100000000000L + new Random().nextInt(900000000);
        card.setMobileNumber(mobileNumber);
        card.setCardNumber(Long.toString(randomCardNumber));
        card.setCardType(CardsConstants.CREDIT_CARD);
        card.setTotalLimit(CardsConstants.NEW_CARD_LIMIT);
        card.setAmountUsed(0);
        card.setAvailableAmount(CardsConstants.NEW_CARD_LIMIT);

        card.setCreatedAt(LocalDateTime.now());
        card.setCreatedBy("Harshit");

        return card;
    }


}

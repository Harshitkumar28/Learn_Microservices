package com.learnms.cards.service;

import com.learnms.cards.dto.CardsDto;

public interface ICardsService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @param cardsDto - CardsDto Object
     * @return boolean indicating if the  update of card details is successful or not
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of card details is successful or not
     */
    boolean deleteCard(String mobileNumber);
}

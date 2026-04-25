package com.learnms.cards.service;

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
    void fetchCard(String mobileNumber);
}

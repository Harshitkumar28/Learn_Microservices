package com.learnms.accounts.service.impl;

import com.learnms.accounts.constants.AccountsConstants;
import com.learnms.accounts.dto.CustomerDto;
import com.learnms.accounts.entity.Accounts;
import com.learnms.accounts.entity.Customer;
import com.learnms.accounts.exception.CustomerAlreadyExistsException;
import com.learnms.accounts.mapper.CustomerMapper;
import com.learnms.accounts.repository.AccountsRepository;
import com.learnms.accounts.repository.CustomerRepository;
import com.learnms.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobile Number" + customerDto.getMobileNumber());
        }

        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("Anonymous");
        Customer savedCustomer = customerRepository.save(customer); // this save method is coming from spring data jpa jpaRepository

        accountsRepository.save(createNewAccount(savedCustomer));

    }

    /**
     *
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());

        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);
        newAccount.setAccountNumber(randomAccNumber);
        System.out.println("random account no is :-                                    ,       " + newAccount.getAccountNumber());
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);

        newAccount.setCreatedAt(LocalDateTime.now());
        newAccount.setCreatedBy("Anonymous");
        return newAccount;
    }



























}

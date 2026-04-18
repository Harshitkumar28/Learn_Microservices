package com.learnms.accounts.controller;

import com.learnms.accounts.constants.AccountsConstants;
import com.learnms.accounts.dto.CustomerDto;
import com.learnms.accounts.dto.ResponseDto;
import com.learnms.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {


        iAccountsService.createAccount(customerDto);

        ResponseDto response =  new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);

    }
}

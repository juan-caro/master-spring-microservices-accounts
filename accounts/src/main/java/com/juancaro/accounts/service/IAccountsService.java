package com.juancaro.accounts.service;

import com.juancaro.accounts.dto.CustomerDto;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);
}

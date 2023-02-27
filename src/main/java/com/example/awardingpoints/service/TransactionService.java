package com.example.awardingpoints.service;

import com.example.awardingpoints.dto.TransactionResponse;


public interface TransactionService  {
    TransactionResponse calculatePointsByCustomer(Long customerId);

}






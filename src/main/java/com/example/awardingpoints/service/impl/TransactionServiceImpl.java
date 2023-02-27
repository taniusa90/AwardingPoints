package com.example.awardingpoints.service.impl;

import com.example.awardingpoints.dto.TransactionResponse;
import com.example.awardingpoints.entity.Transaction;
import com.example.awardingpoints.repository.TransactionRepository;
import com.example.awardingpoints.service.TransactionService;
import com.example.awardingpoints.util.RewardsCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionServiceImpl implements TransactionService {

        @Autowired
        private TransactionRepository transactionRepository;

        @Override
        public void recordTransaction(Transaction transaction) {
            // Calculate rewards points for this transaction
            int pointsEarned = RewardsCalculator.calculatePoints(transaction.getAmount());

            // Set the rewards points earned for this transaction
            transaction.setPointsEarned(pointsEarned);

            // Save the transaction to the database
            transactionRepository.save(transaction);
        }

        public TransactionResponse calculatePointsByCustomer(Long customerId){
            List<Transaction> allByCustomerId = transactionRepository.findAllByCustomerIdAndTransactionDateAfter(customerId, LocalDate.now().minusMonths(3));

            Map<String,List<Transaction>> groupByMonths= new HashMap<>();

         return null;

        }

        private Map<String,List<Transaction>> fillMap=new HashMap<>();




    }




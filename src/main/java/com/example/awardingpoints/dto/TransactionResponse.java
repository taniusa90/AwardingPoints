package com.example.awardingpoints.dto;

import lombok.Data;

import java.util.List;

@Data
public class TransactionResponse{

    private Long customerId;
    private List <PointDto> pointDtoList;




}

package com.example.webfluxdemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Rate {

    private Long id;

    private String code;

    private String ccy;

    private String nominal;

    private double rate;

    private Date date;


}

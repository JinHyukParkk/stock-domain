package com.stock.stockdomain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}

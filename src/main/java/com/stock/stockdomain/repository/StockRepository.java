package com.stock.stockdomain.repository;

import com.stock.stockdomain.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {

}

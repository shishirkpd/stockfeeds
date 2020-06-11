package com.dbs.stockfeeds.service;

import com.dbs.stockfeeds.model.Stock;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    List<Stock> stockList = new ArrayList<Stock>();

    @Override
    public List<Stock> getAllUpdates() {

        stockList.add(new Stock("D05:SGX" , 21.0, 25.0, Instant.now()));
        stockList.add(new Stock("O39:SGX" , 31.0, 29.0, Instant.now()));
        stockList.add(new Stock("U11:SGX" , 10.0, 9.85, Instant.now()));
        return stockList;
    }

    @Override
    public Stock getStockUpdateBySymbol(String symbol) {
        return new Stock(symbol , 21.0, 25.0, Instant.now());
    }
}

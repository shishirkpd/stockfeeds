package com.dbs.stockfeeds.service;

import com.dbs.stockfeeds.model.Stock;

import java.util.List;

public interface  StockService {
    public List<Stock> getAllUpdates();

    public Stock getStockUpdateBySymbol(String symbol);

}

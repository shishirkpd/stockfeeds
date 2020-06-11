package com.dbs.stockfeeds.service;

import com.dbs.stockfeeds.model.Stock;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class StockServiceImplTest {

    private StockService stockService = new StockServiceImpl();


    @Test
    public void shouldReturnAllUpdatesForStocks() {
        List<Stock> stockList = stockService.getAllUpdates();
        assertEquals(stockList.isEmpty(), false);
    }

    @Test
    public void shouldReturnUpdatesForGivenSymbol() {
        Stock stock = new Stock("M29:SGX");
        Stock result = stockService.getStockUpdateBySymbol(stock.getSymbol());
        assertEquals(result.getSymbol(), stock.getSymbol());
    }
}
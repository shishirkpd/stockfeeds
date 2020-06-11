package com.dbs.stockfeeds.controller;

import com.dbs.stockfeeds.model.Stock;
import com.dbs.stockfeeds.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class StockController {
	
	@Autowired
	private StockService stockService;

	public StockController() {

	}

	@RequestMapping(value = "stock/allupdates", method = RequestMethod.GET)
	public List<Stock> getAllStockUpdates() {
		return stockService.getAllUpdates();
	}

	
	@RequestMapping(value = "stock/{symbol}", method = RequestMethod.GET)
	public Stock getStockUpdateBySymbol(@PathVariable String symbol) {
		return stockService.getStockUpdateBySymbol(symbol);
	}
}
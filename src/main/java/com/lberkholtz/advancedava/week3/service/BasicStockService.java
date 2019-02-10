package com.lberkholtz.AdvancedJava.week3.service;

import com.lberkholtz.AdvancedJava.week3.model.StockQuote;

import java.math.BigDecimal;
import java.util.Date;

class BasicStockService implements StockService {
private StockService stockService;
private StockQuote stockquote;

    public BasicStockService() {
    }

    /**
 * Create a new <CODE>BasicStockService</CODE> instance
 *
 * @param stockService used to get actual stock data (external dependency)
 */

public BasicStockService(StockService stockService){
        this.stockService=stockService;
        }
    /**
     * Get stock price for the date specified - Basic layout
     * override interface method
     *
     * @param symbol the stock symbol to get the price for
     * @return a StockQuote instance for the symbol
     */

    public StockQuote getQuote(String symbol) {
        StockQuote stockquote = new StockQuote();
        stockquote.setStockSymbol(symbol);
        stockquote.setStockPrice(new BigDecimal(100.99));
        Date date = new Date();
        stockquote.setQuoteDate(date);
        return stockquote;
    }
        }
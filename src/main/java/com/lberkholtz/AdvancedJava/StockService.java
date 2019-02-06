// Written by Laura Berkholtz
package com.lberkholtz.AdvancedJava;

/**
 * This interface describes a simple API for getting stock data.
 */
public interface StockService {
    /**
     * Return the <CODE>StockData</CODE> for the given symbol for the given date.
     *
     * @param symbol the stock symbol of the company you want a quote for.
     * e.g. APPL for APPLE
     *
     * @return a StockQuote instance
     */
    StockQuote getQuote(String symbol);
}


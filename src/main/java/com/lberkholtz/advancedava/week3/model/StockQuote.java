package com.lberkholtz.advancedava.week3.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 */

public class StockQuote {
    private String stockSymbol;
    private Date date;
    private BigDecimal stockPrice;

    /**
     * no arg constructor
     */

    public StockQuote() {
    }

    /**
     *
     * @param stockSymbol
     * @param date
     * @param stockPrice
     */
    public StockQuote(String stockSymbol, Date date, BigDecimal stockPrice) {
        this.stockSymbol = stockSymbol;
        this.date = date;
        this.stockPrice = stockPrice;
    }

    /**
     *
     * @return
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     *
     * @param stockSymbol
     */
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    /**
     *
     * @return
     */

    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    /**
     *
     * @param stockPrice
     */

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public String  toString() {
        return "StockQuote{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", date=" + date +
                ", stockPrice=" + stockPrice +
                '}';
    }
}

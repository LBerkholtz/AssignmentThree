package com.lberkholtz.AdvancedJava.week3.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class StockQuote {
    private String stockSymbol;
    private Date fromDate;
    private Date toDate;
    private Collection<BigDecimal> stockPrice = new ArrayList<BigDecimal>();

    public StockQuote(String stockSymbol, Date fromDate, Date toDate, Collection<BigDecimal> stockPrice) {
        this.stockSymbol = stockSymbol;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.stockPrice = stockPrice;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Collection<BigDecimal> getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Collection<BigDecimal> stockPrice) {
        this.stockPrice = stockPrice;
    }
}

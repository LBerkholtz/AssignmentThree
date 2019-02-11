/**
 * @author Laura Berkholtz
 */


package com.lberkholtz.advancedava.week3.service;

import com.lberkholtz.advancedava.week3.model.StockQuote;
import com.lberkholtz.advancedava.week3.service.BasicStockService;
import com.lberkholtz.advancedava.week3.service.StockService;
import com.lberkholtz.advancedava.week3.service.StockServiceFactory;

import org.junit.Test;

import static org.junit.Assert.* ;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * Unit test for Stock Quote
 */
public class BasicStockServiceTest {


    /**
     * Test GetQuote method with a single parameter
     */
    @Test
    public void testGetQuote1() {
        StockQuote stockquote = new StockQuote();
        StockServiceFactory stockservicefactory = new StockServiceFactory();
        StockService basicstockservice = stockservicefactory.getStockService("Basic");
        BigDecimal price = new BigDecimal(100.99);
        stockquote = basicstockservice.getQuote("APPL");
        assertTrue("verify Stock Symbol", stockquote.getStockSymbol() == "APPL");
        assertTrue("verify stock price", stockquote.getStockPrice().equals(price));

    }

    @Test
    /**
     * Test the stockQuote method with from and until dates
     */
    public void testGetQuote2() {
        StockServiceFactory stockservicefactory = new StockServiceFactory();
        StockService basicstockservice = stockservicefactory.getStockService("Basic");
        String startdate = "2018-01-01";  // Start date
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar from = Calendar.getInstance();
        try {
            from.setTime(simpledateformat.parse(startdate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String enddate = "2018-01-10";  // End date
        Calendar until = Calendar.getInstance();
        try {
            until.setTime(simpledateformat.parse(enddate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<StockQuote> stockhistory = basicstockservice.getQuote("APPL",from,until);
        assertEquals("verify number of quotes",10, stockhistory.size());
    }



    }





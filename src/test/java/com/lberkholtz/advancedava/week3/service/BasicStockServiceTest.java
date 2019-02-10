package com.lberkholtz.advancedava.week3;

import com.lberkholtz.advancedava.week3.model.StockQuote;
import com.lberkholtz.advancedava.week3.service.BasicStockService;
import com.lberkholtz.advancedava.week3.service.StockService;
import com.lberkholtz.advancedava.week3.service.StockServiceFactory;

import org.mockito.Mockito;

import static org.junit.Assert.* ;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Unit test for Stock Quote
 */
public class BasicStockServiceTest {


    /**
     *
     */

    public void testBasicStockService() {
        StockQuote stockquote = new StockQuote();
        StockServiceFactory stockservicefactory = new StockServiceFactory();
        StockService basicstockservice = stockservicefactory.getStockService("Basic");
        BigDecimal price = new BigDecimal(100.99);
        stockquote = basicstockservice.getQuote("APPL");
        assertTrue("verify Stock Symbol", stockquote.getStockSymbol() == "APPL");
        assertTrue("verify stock price", stockquote.getStockPrice().equals(price));
    }

    /* next we want to 'mock' the external dependency which is the StockQuote
     * so that we can test just the BasicStockService class.  It will return a ‘mock’ of the of the class or interface
     * passed to it.
     */

    public void testBasicStockServiceMockito() {
// first create the data we expect the service to return
        String stockSymbol = "GOOG";
        BigDecimal expectedPrice = new BigDecimal(100.99);
        Date expectedDate = new Date();
        /* next we want to 'mock' the external dependency which is the StockService
         * so that we can test just the StockTicker class. Here is how to setup the mock
         * using the Mockito.mock() Method. It will return a ‘mock’ of the of the class or interface
         * passed to it.
         */
        BasicStockService basicStockServiceMock = Mockito.mock(BasicStockService.class);
        // Next tell the mock service how to behave
        when(basicStockServiceMock.getQuote(stockSymbol)).thenReturn(new StockQuote(stockSymbol, expectedPrice, expectedDate));

        stockquote = basicStockServiceMock.getQuote("GOOG");
        assertTrue(stockquote.getStockSymbol().equals(stockSymbol));
        assertTrue(stockquote.getStockPrice().equals(expectedPrice));
    }
    }




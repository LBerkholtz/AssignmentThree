/**
 * @author Laura Berkholtz
 */


package com.lberkholtz.advancedava.week3.service;


import com.lberkholtz.advancedava.week3.service.BasicStockService;
import com.lberkholtz.advancedava.week3.service.StockServiceFactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;


/**
 * Unit test for Stock Quote
 */
public class StockServiceFactoryTest{
    StockServiceFactory stockservicefactory = new StockServiceFactory();

    /**
     * Test StockService method to see if it passes correctly
     */
    @Test
    public void testGetStockService() {
        assertTrue(stockservicefactory.getStockService("Fancy") == null);
        assertThat(stockservicefactory.getStockService("Basic"), instanceOf(BasicStockService.class));
    }
}



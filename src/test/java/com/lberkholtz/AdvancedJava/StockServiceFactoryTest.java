package com.lberkholtz.AdvancedJava;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;


/**
 * Unit test for Stock Quote
 */
public class StockServiceFactoryTest{
    StockServiceFactory ssf = new StockServiceFactory();

    /**
     * Rigorous Test
     */
    @Test
    public void testGetStockService() {
        assertTrue(ssf.getStockService("Fancy") == null);
        assertThat(ssf.getStockService("Basic"), instanceOf(BasicStockService.class));
    }
}



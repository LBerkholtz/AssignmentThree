package com.lberkholtz.AdvancedJava.week3.service;

import com.lberkholtz.AdvancedJava.week3.service.BasicStockService;
import com.lberkholtz.AdvancedJava.week3.service.StockService;

/**
 * Returns a concrete implementation of the
 * interface depending on
 */
public class StockServiceFactory{
    /**
     * Just coding for BasicStockService now, can add more types of StockService in the future.
     * @param stockServiceType
     * @return
     */

    public StockService getStockService(String stockServiceType) {

        if (stockServiceType.equalsIgnoreCase("Basic"))
            return new BasicStockService();
        else
            return null;

    }
}

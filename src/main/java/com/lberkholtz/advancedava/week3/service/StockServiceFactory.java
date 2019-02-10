package com.lberkholtz.advancedava.week3.service;

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

        if (stockServiceType.equalsIgnoreCase("basic"))
            return new BasicStockService();
        else
            return null;

    }
}

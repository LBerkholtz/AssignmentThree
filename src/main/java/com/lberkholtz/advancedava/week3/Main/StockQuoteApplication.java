package com.lberkholtz.advancedava.week3.Main;

import com.lberkholtz.advancedava.week3.model.StockQuote;
import com.lberkholtz.advancedava.week3.service.StockService;
import com.lberkholtz.advancedava.week3.service.StockServiceFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import static java.lang.System.out;

public class StockQuoteApplication {

    /**
     * @param args
     * @throws ParseException
     */

    public static void main(String[] args) throws ParseException {

        StockService stockservice = new StockServiceFactory().getStockService("basic");


        if (args.length == 1) {
            StockQuote singlestockquote = stockservice.getQuote(args[0]);
            System.out.println(singlestockquote.toString());

        } else if (args.length != 0) {

            String fromDate = args[1];
            String untilDate = args[2];

            SimpleDateFormat startdateformat = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat enddateformat = new SimpleDateFormat("MM/dd/yyyy");

            Calendar startDate = Calendar.getInstance();
            Calendar endDate = Calendar.getInstance();

            try {

                startDate.setTime(startdateformat.parse(fromDate));
                endDate.setTime(enddateformat.parse(untilDate));

            } catch (ParseException e) {

                e.printStackTrace();

            }

            List<StockQuote> stockquotelist = stockservice.getQuote(args[0], startDate, endDate);

            for (StockQuote tempstockquote : stockquotelist) {
                System.out.println(tempstockquote.toString());
            }
        }
        }
    }




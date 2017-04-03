package com.nact.broker;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizationCurrencyTester {

    /**
     * example demonstrates Indian currency symbol and custom format.
     *
     * Program outputs: ₹ २००,१००,०४०.१२
     *
     */
    public static void main(String[] args) throws Exception {
        double amount = 200100040.12;
        NumberFormat nfci = NumberFormat.getCurrencyInstance(new Locale("hi", "IN"));
        DecimalFormat df_nfci = (DecimalFormat)nfci;
        df_nfci.applyPattern("\u20B9 ###,###.##");
        String indianMoney = df_nfci.format(amount);
        System.out.println(indianMoney);
    }
}

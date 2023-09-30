package ru.mirea.it.ivbo;


import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    private double usdToRub = 97.41;
    private double eurToRub = 103.16;

    public double rubToUsd(double rub)
    {
        return rub / usdToRub;
    }

    public double rubToEur(double rub) {
        return rub / eurToRub;
    }

    public double usdToRub(double usd) {
        return usd * usdToRub;
    }

    public double eurToRub(double eur) {
        return eur * eurToRub;
    }

    public String formatRU(double num)
    {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(num);
    }

    public String formatUS(double num)
    {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat.format(num);
    }

    public String formatEU(double num)
    {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return numberFormat.format(num);
    }

    public Converter() {

        double rubles = 1000.0;
        double dollars = rubToUsd(rubles);
        double euros;

        System.out.println(formatRU(rubles) + " = " + formatUS(dollars));

        dollars = 10.0;
        rubles = usdToRub(dollars);
        System.out.println(formatUS(dollars) + " = " + formatRU(rubles));

        euros = 10.0;
        rubles = eurToRub(euros);
        System.out.println(formatEU(euros) + " = " + formatRU(rubles));
    }
}

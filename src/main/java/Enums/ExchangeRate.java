package Enums;

import java.util.Date;

public class ExchangeRate {

    float rate = 5.1f;

    Date date = new Date();
    Currency currency;

    public ExchangeRate(float rate, Date date, Currency currency) {
        this.rate = rate;
        this.date = date;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "rate=" + rate +
                ", date=" + date +
                ", currency=" + currency.name() + currency.getLogo() +
                '}';
    }
}

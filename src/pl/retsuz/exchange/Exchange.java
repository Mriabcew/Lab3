package pl.retsuz.exchange;

import pl.retsuz.currency.ICurrency;

public class Exchange implements IExchange{
    public double exchange(ICurrency src, ICurrency tgt, double amt) //Oblicza otrzymaną ilość środka pieniężnego po podaniu wartości źródłowej, waluty źródłowej oraz waluty docelowej
    {
        return (amt * src.getRate()) / src.getFactor() / tgt.getFactor() * tgt.getRate();
    }
}

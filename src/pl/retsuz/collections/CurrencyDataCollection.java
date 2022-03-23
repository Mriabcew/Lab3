package pl.retsuz.collections;

import pl.retsuz.collections.IDataCollection;
import pl.retsuz.currency.ICurrency;

import java.util.List;

public class CurrencyDataCollection implements IDataCollection {
    String name;
    List <ICurrency> list;
    ICurrency code;

    public String ToString() //Zwraca ciąg znaków, reprezentujący wszystkie obiekty Currency komponowane w klasie
    {
        
        return name;
    }

    public List<ICurrency> getCurrencyList() //Zwraca referencję do listy obiektów Currency w klasie
    {
        return null;
    }

    public ICurrency getCurrencyByCode(ICurrency currency) //Zwraca pełen obiekt Currency z listy po podaniu obiektu Currency, z ustawionym kodem waluty
    {
        return null;
    }
}

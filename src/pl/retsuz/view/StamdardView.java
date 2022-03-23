package pl.retsuz.view;

import pl.retsuz.collections.IDataCollection;
import pl.retsuz.currency.ICurrency;
import pl.retsuz.exchange.IExchange;
import pl.retsuz.view.ICurrencyView;

public class StamdardView implements ICurrencyView{
    public void setExchange(IExchange exchange) //Ustawia referencję do obiektu typu implementującego IExchange
    {

    }

    public void setDataCollection(IDataCollection collection) //Ustawia referencję do obiektu typu implementującego IDataCollection
    {

    }

    public void ViewAll(IDataCollection coll) //Wyświetla wszystkie waluty
    {

    }

    public ICurrency StringToCurrency(String code) //Po podaniu kodu tworzy obiekt Currency z ustawionym kodem, a następnie z jego wykorzystaniem przeszukuje kolekcję typu IDataCollection
    {
        return null;
    }

    public ICurrency ChooseCurrency(String label) //Prosi uytkownika o podanie kodu, a następnie deleguje wybór waluty do metody StringToCurrency
    {
        return null;
    }

    public void exchange() //Interakcyjnie na bazie metody ChooseCurrency dokonuje przeliczenia walut na bazie IExchange
    {

    }

    public void menu() //Interakcyjnie wyświetla menu
    {

    }
}

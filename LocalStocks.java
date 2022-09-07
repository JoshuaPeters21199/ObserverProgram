import java.util.ArrayList;

public class LocalStocks implements Subject {
    private ArrayList<Observer> observers;
    private String dateAndTime;
    private String companyName;
    private String tickerSymbol;
    private double currentPrice;
    private double priceChange;
    private double percentChange;
    private double YTDChange;
    private double fiftyTwoWkHigh;
    private double fiftyTwoWkLow;
    private double PERatio;
    
    public LocalStocks() {
        observers = new ArrayList<Observer> ();
    }

    public void registerObserver (Observer o) {
        observers.add(o);
    }

    public void removeObserver (Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(
                dateAndTime,
                companyName,
                tickerSymbol,
                currentPrice,
                priceChange,
                percentChange,
                YTDChange,
                fiftyTwoWkHigh,
                fiftyTwoWkLow,
                PERatio
            );
        }
    }

    public void dataChanged() {
        notifyObservers();
    }

    public void setData(
        String dateAndTime,
        String companyName,
        String tickerSymbol,
        double currentPrice,
        double priceChange,
        double percentChange,
        double YTDChange,
        double fiftyTwoWkHigh,
        double fiftyTwoWkLow,
        double PERatio
    ) {
        this.dateAndTime = dateAndTime;
        this.companyName = companyName;
        this.tickerSymbol = tickerSymbol;
        this.currentPrice = currentPrice;
        this.priceChange = priceChange;
        this.percentChange = percentChange;
        this.YTDChange = YTDChange;
        this.fiftyTwoWkHigh = fiftyTwoWkHigh;
        this.fiftyTwoWkLow = fiftyTwoWkLow;
        this.PERatio = PERatio;
        dataChanged();
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public double getYTDChange() {
        return YTDChange;
    }

    public double getFiftyTwoWkHigh() {
        return fiftyTwoWkHigh;
    }

    public double getFiftyTwoWkLow() {
        return fiftyTwoWkLow;
    }

    public double getPERatio() {
        return PERatio;
    }
}

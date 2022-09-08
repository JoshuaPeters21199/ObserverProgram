public class Snapshot {

    String snapDateAndTime;
    String snapCompanyName;
    String snapTickerSymbol;
    double snapCurrentPrice;
    double snapPriceChange;
    double snapPercentChange;
    double snapYTDChange;
    double snapFiftyTwoWkHigh;
    double snapFiftyTwoWkLow;
    double snapPERatio;
    
    public Snapshot(
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
        snapDateAndTime = dateAndTime;
        snapCompanyName = companyName;
        snapTickerSymbol = tickerSymbol;
        snapCurrentPrice = currentPrice;
        snapPriceChange = priceChange;
        snapPercentChange = percentChange;
        snapYTDChange = YTDChange;
        snapFiftyTwoWkHigh = fiftyTwoWkHigh;
        snapFiftyTwoWkLow = fiftyTwoWkLow;
        snapPERatio = PERatio;
    }

    public String getDateAndTime() {
        if (snapDateAndTime == "") {
            return "";
        }
        else {
            return snapDateAndTime + "\n";
        }
    }

    public String getCompanyName() {
        return snapCompanyName;
    }

    public String getTickerSymbol() {
        return snapTickerSymbol;
    }

    public double getCurrentPrice() {
        return snapCurrentPrice;
    }

    public double getPriceChange() {
        return snapPriceChange;
    }

    public double getPercentChange() {
        return snapPercentChange;
    }

    public double getYTDChange() {
        return snapYTDChange;
    }

    public double getFiftyTwoWkHigh() {
        return snapFiftyTwoWkHigh;
    }

    public double getFiftyTwoWkLow() {
        return snapFiftyTwoWkLow;
    }

    public double getPERatio() {
        return snapPERatio;
    }
}

public class CompanyData {
    String companyName;
    String tickerSymbol;
    String currentPrice;
    String priceChange;
    String percentChange;
    String YTDChange;
    String fiftyTwoWkHigh;
    String fiftyTwoWkLow;
    String PERatio;

    public CompanyData (
        String parCompanyName,
        String parTickerSymbol,
        String parCurrentPrice,
        String parPriceChange,
        String parPercentChange,
        String parYTDChange,
        String parFiftyTwoWkHigh,
        String parFiftyTwoWkLow,
        String parPERatio
    ) {
        companyName = parCompanyName;
        tickerSymbol = parTickerSymbol;
        currentPrice = parCurrentPrice;
        priceChange = parPriceChange;
        percentChange = parPercentChange;
        YTDChange = parYTDChange;
        fiftyTwoWkHigh = parFiftyTwoWkHigh;
        fiftyTwoWkLow = parFiftyTwoWkLow;
        PERatio = parPERatio;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public String getPriceChange() {
        return priceChange;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public String getYTDChange() {
        return YTDChange;
    }

    public String getFiftyTwoWkHigh() {
        return fiftyTwoWkHigh;
    }

    public String getFiftyTwoWkLow() {
        return fiftyTwoWkLow;
    }

    public String getPERatio() {
        return PERatio;
    }
}

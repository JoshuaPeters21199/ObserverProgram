public interface Observer {
    public void update(
        String dateAndTime, 
        String companyName, 
        String tickerSymbol,
        double currentPrice,
        double priceChange,
        double percentChange,
        double YTDChange,
        double fiftyTwoWkHigh,
        double fiftyTwoWkLow,
        double PERatio);
}

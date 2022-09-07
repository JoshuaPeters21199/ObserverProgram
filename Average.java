import java.io.FileWriter;
import java.io.IOException;

public class Average implements Observer, WriteToFile {
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
    private LocalStocks localStocks;

    public Average(LocalStocks localStocks) {
        this.localStocks = localStocks;
        localStocks.registerObserver(this);
    }

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
        writeToFile();
    }

    public void writeToFile() {
        try {
            FileWriter averageFile = new FileWriter("Average.dat");
            averageFile.write(companyName + " " + tickerSymbol + " " + currentPrice + " " + priceChange + " " + percentChange + " " + YTDChange + " " + fiftyTwoWkHigh + " " + fiftyTwoWkLow + " " + PERatio);
            averageFile.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

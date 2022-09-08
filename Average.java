import java.io.FileWriter;
import java.io.IOException;

public class Average implements Observer, WriteToFile {
    LocalStocks localStocks;
    Snapshot snapshot;

    public Average(LocalStocks localStocks) {
        this.localStocks = localStocks;
        localStocks.registerObserver(this);
    }

    public void update(Snapshot snapshot) {
        this.snapshot = snapshot;
        writeToFile();
    }

    public void writeToFile() {
        try {
            FileWriter averageFile = new FileWriter("Average.dat");
            averageFile.write(snapshot.getDateAndTime() + snapshot.getCompanyName() + " " + snapshot.getTickerSymbol() + " " + snapshot.getCurrentPrice() + " " + snapshot.getPriceChange() + " " + snapshot.getPercentChange() + " " + snapshot.getYTDChange() + " " + snapshot.getFiftyTwoWkHigh() + " " + snapshot.getFiftyTwoWkLow() + " " + snapshot.getPERatio());
            averageFile.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

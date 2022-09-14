import java.util.ArrayList;
import java.io.*;

public class Selections implements Observer, WriteToFile {
    Subject localStock;
    Snapshot snapshot;

    public Selections (Subject localStock) {
        this.localStock = localStock;
        localStock.registerObserver(this);
    }

    public void update(Snapshot snapshot) {
        this.snapshot = snapshot;
        writeToFile();
    }

    public void writeToFile() {
        ArrayList<CompanyData> companies = snapshot.getCompanies();

        try {
            File f1 = new File("Selections.dat");
            if (!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(f1.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(snapshot.getDateAndTime() + "\n");
            for (CompanyData company : companies) {
                if (company.getTickerSymbol().equals("ALL")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("BA")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("BC")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("GBEL")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("KFT")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("MCD")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("TR")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                } else if (company.getTickerSymbol().equals("WAG")) {
                    bw.write(company.getCompanyName() + " " + company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPriceChange() + " " + company.getPercentChange() + " " + company.getYTDChange() + " " + company.getFiftyTwoWkHigh() + " " + company.getFiftyTwoWkLow() + " " + company.getPERatio() + "\n");  
                }
            }
            bw.write("\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

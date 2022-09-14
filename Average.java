import java.util.ArrayList;
import java.io.*;

public class Average implements Observer, WriteToFile {
    Subject localStock;
    Snapshot snapshot;

    public Average (Subject localStock) {
        this.localStock = localStock;
        localStock.registerObserver(this);
    }

    public void update(Snapshot snapshot) {
        this.snapshot = snapshot;
        writeToFile();
    }

    public double calculateAverage() {
        ArrayList<CompanyData> companies = snapshot.getCompanies();
        Double totalOfAllStocks = 0.0;
        int numberOfCompanies = 0;

        //int arrLength = companies.size();

        for (CompanyData company : companies) {
            //CompanyData company = companies.get(i);
            String stockPrice = company.getCurrentPrice();
            Double doubleStockPrice = Double.parseDouble(stockPrice);
            totalOfAllStocks += doubleStockPrice;
            numberOfCompanies += 1;
        }

        Double averageCostOfStocks = totalOfAllStocks / numberOfCompanies;
        return averageCostOfStocks;
    }

    public void writeToFile() {
        String[] splitDateAndTime = snapshot.getDateAndTime().split(" ");
        String shortenedDatAndtime = "";
        for (int i = 2; i < 6; i++) {
            shortenedDatAndtime += splitDateAndTime[i] + " ";
        }

        String oneLine = shortenedDatAndtime + " , " + calculateAverage() + "\n";

        try {
            File f1 = new File("Average.dat");
            if (!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(f1.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(oneLine);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

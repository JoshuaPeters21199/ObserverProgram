import java.util.ArrayList;
import java.io.*;

public class ChangeTen implements Observer, WriteToFile {
    Subject localStock;
    Snapshot snapshot;

    public ChangeTen (Subject localStock) {
        this.localStock = localStock;
        localStock.registerObserver(this);
    }

    public void update(Snapshot snapshot) {
        this.snapshot = snapshot;
        writeToFile();
    }

    public ArrayList<String> calculatePercentChange() {
        ArrayList<CompanyData> companies = snapshot.getCompanies();
        ArrayList<String> companiesWithPercentChange = new ArrayList<String>();

        for (CompanyData company : companies) {
            String change10Str = "";
            String strPercentChange = company.getPercentChange();
            Double percentChange = Double.parseDouble(strPercentChange);
            if (percentChange > 10.0 || percentChange < -10.0) {
                change10Str += company.getTickerSymbol() + " " + company.getCurrentPrice() + " " + company.getPercentChange();
                companiesWithPercentChange.add(change10Str);
            }
        }
        return companiesWithPercentChange;
    }

    public void writeToFile() {
        String[] splitDateAndTime = snapshot.getDateAndTime().split(" ");
        String shortenedDatAndtime = "";
        for (int i = 2; i < 7; i++) {
            shortenedDatAndtime += splitDateAndTime[i] + " ";
        }

        try {
            File f1 = new File("Change10.dat");
            if (!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(f1.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(shortenedDatAndtime + "\n");
            for (String s : calculatePercentChange()) {
                bw.write(s + "\n");
            }
            bw.write("\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

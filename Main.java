import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        LocalStock localStock = new LocalStock();

        Average average = new Average(localStock);
        ChangeTen changeTen = new ChangeTen(localStock);
        Selections selections = new Selections(localStock);

        try {
            ArrayList<CompanyData> tempArr = new ArrayList<CompanyData>();
            String tempDateAndTime = "";
            
            File myFile = new File("Ticker.dat");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.trim().isEmpty()) {
                    Snapshot snapshot = new Snapshot(tempDateAndTime, tempArr);
                    localStock.setData(snapshot);
                    tempArr.clear();
                } 
                
                else if (data.contains("Last")) {
                    tempDateAndTime = data;
                } 
                
                else {
                    String[] splitData = data.split(" ");
                    String companyName = "";
                    int l = splitData.length - 1;
                    int companyNameLength = l - 8;
                    for (int i = 0; i < companyNameLength; i++ ) {
                        companyName += splitData[i] + " ";
                    }
                    CompanyData companyData = new CompanyData (
                        companyName,
                        splitData[l-8],
                        splitData[l-7],
                        splitData[l-6],
                        splitData[l-4],
                        splitData[l-3],
                        splitData[l-2],
                        splitData[l-1],
                        splitData[l]
                    );
                    tempArr.add(companyData);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

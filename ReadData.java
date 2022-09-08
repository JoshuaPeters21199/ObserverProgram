import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public ReadData() {
        try {
            File myFile = new File("Ticker.dat");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                
            }
            myReader.close();
         } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }
    }
}

public class Main {

    public static void main(String[] args) {
        Snapshot snapshot = new Snapshot
        (
            //"Sep 1, 2005 4:58:41 PM ET",
            "",
            "A.M. CASTLE & COMPANY", 
            "CAS", 
            15.71, 
            0.55, 
            3.63, 
            31.57, 
            17.97, 
            8.99, 
            7.79
        );

        // System.out.println(snapshot.getCompanyName());
        // System.out.println(snapshot.getCurrentPrice());
        LocalStocks localStocks = new LocalStocks();

        Average a = new Average(localStocks);

        localStocks.setData(snapshot);
            // "Sep 1, 2005 4:58:41 PM ET", 
            // "A.M. CASTLE & COMPANY", 
            // "CAS", 
            // 15.71, 
            // 0.55, 
            // 3.63, 
            // 31.57,
            // 17.97, 
            // 8.99, 
            // 7.79);
    }
}

import java.util.ArrayList;

public class Snapshot {
    String dateAndTime;
    ArrayList<CompanyData> snapshotCompanies;

    public Snapshot(String snapDateAndTime, ArrayList<CompanyData> companiesArr) {
        dateAndTime = snapDateAndTime;
        snapshotCompanies = companiesArr;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getAllCompanyInfo() {
        String allCompanyInfo = "";
        for (CompanyData company : snapshotCompanies) {
            allCompanyInfo += company.getCompanyName() + " ";
            allCompanyInfo += company.getTickerSymbol() + " ";
            allCompanyInfo += company.getCurrentPrice() + " ";
            allCompanyInfo += company.getPriceChange() + " ";
            allCompanyInfo += company.getPercentChange() + " ";
            allCompanyInfo += company.getYTDChange() + " ";
            allCompanyInfo += company.getFiftyTwoWkHigh() + " ";
            allCompanyInfo += company.getFiftyTwoWkLow() + " ";
            allCompanyInfo += company.getPERatio() + "\n";
        }
        return allCompanyInfo;
    }

    public ArrayList<CompanyData> getCompanies() {
        return snapshotCompanies;
    }
}

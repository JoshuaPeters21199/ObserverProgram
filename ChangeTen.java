public class ChangeTen implements Observer, WriteToFile {
    Subject localStock;
    Snapshot snapshot;

    public ChangeTen () {
        int i = 10;
    }

    public void update(Snapshot snapshot) {
        this.snapshot = snapshot;
        writeToFile();
    }

    public void writeToFile() {
        System.out.println("Change ten");
    }
    
}

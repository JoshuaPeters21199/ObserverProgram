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
        System.out.println("Selections");
    }
}

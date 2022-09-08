import java.util.ArrayList;

public class LocalStocks implements Subject {
    ArrayList<Observer> observers;
    Snapshot snapshot;
    
    public LocalStocks() {
        observers = new ArrayList<Observer> ();
    }

    public void registerObserver (Observer o) {
        observers.add(o);
    }

    public void removeObserver (Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(snapshot);
        }
    }

    public void dataChanged() {
        notifyObservers();
    }

    public void setData(Snapshot snapshot) {
        this.snapshot = snapshot;
        dataChanged();
    }
}

package observerpattern.observable;

import observerpattern.observer.IObserver;

public interface IObservable {
     void addObserver(IObserver observer);
     void removeObserver(IObserver observer);
     void notifyObserver();
}

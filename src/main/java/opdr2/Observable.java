package opdr2;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private static final List<Observer> observers = new ArrayList<>();

    public static void addObserver(Observer observer){
        observers.add(observer);
    }

    public static void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public static void update(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}

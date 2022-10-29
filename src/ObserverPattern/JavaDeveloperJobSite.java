package ObserverPattern;

import Factory.Vacancy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class JavaDeveloperJobSite implements Observed {
    List<Observer> subscribers=new ArrayList<>();
    LinkedList<Vacancy> vacs=new LinkedList<Vacancy>();
    public JavaDeveloperJobSite(LinkedList<Vacancy> list){
        vacs=list;
    }


    @Override
    public void addObserver(Observer observer) {
    this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:subscribers){
            observer.handleEvent(this.vacs);
        }
}
}


package ObserverPattern;

import Factory.Vacancy;

import java.util.LinkedList;

public class Subscriber implements Observer {
    String name;
    public Subscriber(String name){
        this.name=name;
    }
    @Override
    public void handleEvent(LinkedList<Vacancy> list){
        System.out.println("Dear "+name+"\nWe have new vacancy:\n"+list.getLast()+"\n======================" +
                "================================\n");
    }
}

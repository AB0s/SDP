package ObserverPattern;

import Factory.Vacancy;

import java.util.LinkedList;
import java.util.List;

public interface Observer {
    public void handleEvent(LinkedList<Vacancy> list);
}

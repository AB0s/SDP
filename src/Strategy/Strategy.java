package Strategy;

import Factory.Vacancy;

import java.util.LinkedList;

public interface Strategy {
    public default void Operation(LinkedList<Vacancy> list){};
    public default void PrintingMenu(){};
}

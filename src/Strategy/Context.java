package Strategy;

import Factory.Vacancy;

import java.util.LinkedList;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void executeOperation(LinkedList<Vacancy> list){
        strategy.Operation(list);
    }
    public void executePrintingMenu(){strategy.PrintingMenu();};
}

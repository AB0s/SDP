
import Factory.Vacancy;
import Factory.VacancyFactory;
import Strategy.*;
import ObserverPattern.JavaDeveloperJobSite;
import ObserverPattern.Subscriber;
import ObserverPattern.Observed;
import ObserverPattern.Observer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    static LinkedList<Vacancy> list=new LinkedList<Vacancy>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        JavaDeveloperJobSite jobSite=new JavaDeveloperJobSite(list);
        Context context=new Context(new addNewVacancy());
        Context context1=new Context(new printMenu());
        Context context2=new Context(new deleteVacancy());
        boolean IsThereSubscriber=false;
        list.add(new Vacancy("Laravel","Almaty",9000));
        list.add(new Vacancy("Flutter","Almaty",10000));
        System.out.println("Welcome");
        context1.executePrintingMenu();
        int menuNum=sc.nextInt();
        while(true){
        if(menuNum==1){
            if(list.isEmpty()){
                System.out.println("No vacancies added");
            }else {
                for (Vacancy vacancy : list) {
                    System.out.println(vacancy);
                }
            }
        }
        else if(menuNum==2){
            context.executeOperation(list);
            if(IsThereSubscriber){jobSite.notifyObserver();}
            else {System.out.println("You added new vacancy: "+list.getLast());}
        }
        else if(menuNum==3){
            context2.executeOperation(list);
        }
        else if(menuNum==0){
            System.out.println("Exit successfully");
            System.exit(0);
        }
        else if(menuNum==4){
            System.out.println("Enter your name");
            String name=sc1.nextLine();
            Observer subscriber= new Subscriber(name);
            jobSite.addObserver(subscriber);
            System.out.println("You are subscriber now");
            IsThereSubscriber=true;
        }
        menuNum = sc.nextInt();
        }
    }
}


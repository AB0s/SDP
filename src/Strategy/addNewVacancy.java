package Strategy;

import Factory.Vacancy;

import java.util.LinkedList;
import java.util.Scanner;

public class addNewVacancy implements Strategy{
    @Override
    public void Operation(LinkedList<Vacancy> list){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name of vacancy");
        String name=sc1.nextLine();
        System.out.println("Enter location of vacancy");
        String location=sc1.nextLine();
        System.out.println("Enter the salary");
        double salary=sc1.nextDouble();
        list.add(new Vacancy(name,location,salary));
    }
}

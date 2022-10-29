package Strategy;

import Factory.Vacancy;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class deleteVacancy implements Strategy{
    public void Operation(LinkedList<Vacancy> list){
        Scanner sc1=new Scanner(System.in);
        boolean IsItThere=false;
        System.out.println("Enter the vacancy name");
        String name=sc1.nextLine();
        for(int i=0;i<list.size();i++){
            if(Objects.equals(list.get(i).getName(), name)){
                list.remove(i);
                IsItThere=true;
            }
        }
        if (IsItThere){
            System.out.println("Vacancy deleted");
        }
        else{
            System.out.println("Vacancy not found");
        }
    }
}

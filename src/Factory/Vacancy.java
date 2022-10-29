package Factory;

public class Vacancy{
    private String name;
    private String location;
    private double salary;

    public Vacancy(String name,String location,double salary){
        this.name=name;
        this.location=location;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location=location;
    }
    public double getSalary(){
        return this.salary;
    }
    public String toString(){
        return "Name: "+this.getName()+", "+"Location: "+this.getLocation()+", "+"Salary: "+this.getSalary();
    }

}

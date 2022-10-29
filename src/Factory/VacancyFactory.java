package Factory;

public class VacancyFactory {
    public static Vacancy getVacancy(String name,String location,double salary){
        return new Vacancy(name,location,salary);
    }
}

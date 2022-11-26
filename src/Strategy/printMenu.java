package Strategy;

public class printMenu implements Strategy{
    @Override
    public void PrintingMenu() {
        System.out.println("1.Show all vacancies. \n2.Add Vacancy. \n3.Delete Vacancy. \n4.Subscribe to notifications.");
    }
}

import classes.School;
import classes.SchoolProxyImpl;

public class Main {
    public static void main(String[] args) {
        // Create school proxy
        School school = new SchoolProxyImpl();

        // Do the school methods
        school.nameOfCountry();
        school.dateOfCreation();
        school.amountOfStudents();
    }
}

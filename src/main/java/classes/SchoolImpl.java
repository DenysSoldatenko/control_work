package classes;

public class SchoolImpl implements School{
    @Override
    public void dateOfCreation() {
        System.out.println("Date of creation: 12.02.1998");
    }

    @Override
    public void amountOfStudents() {
        System.out.println("Amount of students: 560");
    }

    @Override
    public void nameOfCountry() {
        System.out.println("Name of country: Ukraine");
    }
}

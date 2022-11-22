package classes;

public class SchoolProxyImpl implements School{
    SchoolImpl school;
    @Override
    public void dateOfCreation() {
        initialization();
        System.out.println("---You in proxy method---");
        school.dateOfCreation();
    }

    @Override
    public void amountOfStudents() {
        initialization();
        System.out.println("---You in proxy method---");
        school.amountOfStudents();
    }

    @Override
    public void nameOfCountry() {
        initialization();
        System.out.println("---You in proxy method---");
        school.nameOfCountry();
    }

    private void initialization() {
        if (school == null) {
            school = new SchoolImpl();
        }
    }
}

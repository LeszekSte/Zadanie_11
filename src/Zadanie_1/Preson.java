package Zadanie_1;

public class Preson {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Preson(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || lastName == null || firstName.length() < 3 || lastName.length() < 3)
            throw new NameUndefinedException();
        if (age < 1)
            throw new IncorrectAgeException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length() < 3)
            throw new NameUndefinedException();
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 3)
            throw new NameUndefinedException();
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1)
            throw new IncorrectAgeException();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex sex;
    String emailAddress;

    public int getAge() {
        return 0;
    }

    public void printPerson() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}


import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex sex;
    String emailAddress;

    public Person(String name, Sex sex, String emailAddress) {
        this.name = name;
        this.sex = sex;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return 0;
    }

    public String printPerson() {
        System.out.println(toString());
        return toString();
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


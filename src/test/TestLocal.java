import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {
    @Test
    public void testPersonChecker() {
        ArrayList<Person> people = new ArrayList<>();
        Person p = new Person("Fred", Person.Sex.MALE, "wethekutest@weh0tmail.com");
        people.add(p);
        people.add(new Person("Lucy", Person.Sex.FEMALE, "professionalEmail@gmail.com"));
        people.add(new Person("real human name", Person.Sex.FEMALE, "realhumanemail@aol.com"));
        //the fakest part here is that someone uses aol lol
        String expected = p.printPerson() + "\n";

        String actual = PersonService.printPersons(people, new PersonChecker());

        Assert.assertEquals(expected, actual);
    }
}

public class PersonChecker implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.sex == Person.Sex.MALE;
    }
}

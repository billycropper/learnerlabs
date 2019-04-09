import learner.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(123, "Will");
        Object expected = person;

        Object actual = person;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person(123, "Will");
        String expected = "William";

        person.setName("William");

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
}

import learner.People;
import learner.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();

        int expected = 1;

        people.add(new Person(123, "William"));
        int actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        People people = new People();
        people.add(new Person(123, "William"));
        people.add(new Person(456, "Will"));
        //Person person = new Person(123, "William");

        int expected = 1;
        people.remove(123);

        int actual = people.count();

        Assert.assertEquals(expected, actual);
    }

}

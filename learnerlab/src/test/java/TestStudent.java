import learner.ILearner;
import learner.Person;
import learner.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(123, "William");
        boolean actual = student instanceof ILearner;

        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(123, "William");
        boolean actual = student instanceof Person;

        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        Student student = new Student(123, "William");

        double expected = 10.0;

        student.setTotalStudyTime(5.0);
        student.learn(5.0);

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);
    }
}

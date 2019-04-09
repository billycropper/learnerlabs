import learner.ITeacher;
import learner.Instructor;
import learner.Person;
import learner.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(123,"William");

        boolean actual = instructor instanceof ITeacher;

        boolean expected = true;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(123, "William");

        boolean actual = instructor instanceof Person;

        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(123, "William");
        Student student = new Student(123, "William");

        instructor.teach(student, 5.0);

        double actual = student.getTotalStudyTime();

        double expected = 5.0;

        Assert.assertEquals(actual, expected, 0.01);
    }

//    @Test
//    public void testLecture(){
//        Instructor instructor = new Instructor(123, "William");
//        Student student = new Student(456, "Billy");
//
//        //instructor.lecture(student, 5.0);
//    }

}

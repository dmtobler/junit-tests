import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

//    Cohort emptyCohort;
//    Cohort cohortWithOne;
//    Cohort cohortWithMany;
//
//    @Before
//    public void setup(){
//        emptyCohort = new Cohort();
//        cohortWithOne = new Cohort();
//        cohortWithMany = new Cohort();
//
//        Student fer = new Student(1, "Fer M");
//        fer.addGrade(90);
//
//        Student trant = new Student(2, "Trant B");
//        trant.addGrade(100);
//        trant.addGrade(100);
//        trant.addGrade(100);
//
//        cohortWithOne.addStudent(fer);
//        cohortWithMany.addStudent(fer);
//        cohortWithMany.addStudent(trant);
//    }
//
//    @Test
//    public void testAddStudentAndGetStudentsWork(){
//        assertEquals(0, emptyCohort.getStudents().size());
//        assertEquals(1, cohortWithOne.getStudents().size());
////        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
//    }
//
//    @Test
//    public void testIfAvgIsCorrect(){
//        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
//    }

    public Cohort testCohort;
    public Student danielle, justin, swinny, quintin;

    @Before
    public void setUp() {
        testCohort = new Cohort();
        danielle = new Student(1, "Danielle");
        danielle.addGrade(90);
        justin = new Student(2, "Justin");
        justin.addGrade(90);
        swinny = new Student(3, "Swinny");
        swinny.addGrade(100);
        quintin = new Student(4, "Quintin");
        quintin.addGrade(100);
    }

    @Test
    public void testAddStudent() {

        // Test to see students is empty ArrayList before adding student
        assertTrue(testCohort.getStudents().isEmpty());

        // Test addStudent()
        testCohort.addStudent(danielle);
        assertFalse(testCohort.getStudents().isEmpty());
        assertEquals(1, testCohort.getStudents().size());
        // Test passes - 1 student was added to the testCohort students array
    }

    @Test
    public void testGetStudents() {

        List<Student> students = testCohort.getStudents();

        assertEquals(0, testCohort.getStudents().size());

        testCohort.addStudent(danielle);
        assertEquals(1, testCohort.getStudents().size());

        testCohort.addStudent(justin);
        assertEquals(2, testCohort.getStudents().size());

        testCohort.addStudent(swinny);
        assertEquals(3, testCohort.getStudents().size());

        testCohort.addStudent(quintin);
        assertEquals(4, testCohort.getStudents().size());
        // Test passes - returns the same size as expected each time a student is added


        assertEquals("Danielle", students.get(0).getName());
        assertEquals("Justin", students.get(1).getName());
        assertEquals("Swinny", students.get(2).getName());
        assertEquals("Quintin", students.get(3).getName());
        // Test passes - all students in the list have the expected names
    }

    @Test
    public void testGetCohortAverage() {
        testCohort.addStudent(danielle);
        testCohort.addStudent(justin);
        testCohort.addStudent(swinny);
        testCohort.addStudent(quintin);

        assertEquals(95.0, testCohort.getCohortAverage(), 0);
        // Test passes - expected cohort grade of 95.0 ((90 + 90 + 100 + 100) / 4)
    }
}
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
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
    public Student danielle;

    @Before
    public void setUp() {
        testCohort = new Cohort();
        danielle = new Student(1, "Danielle");
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

        assertEquals(0, testCohort.getStudents().size());

        testCohort.addStudent(new Student(1, "Danielle"));
        assertEquals(1, testCohort.getStudents().size());

        testCohort.addStudent(new Student(2, "Justin"));
        assertEquals(2, testCohort.getStudents().size());

        testCohort.addStudent(new Student(3, "Swinny"));
        assertEquals(3, testCohort.getStudents().size());

        testCohort.addStudent(new Student(4, "Quintin"));
        assertEquals(4, testCohort.getStudents().size());
    }

    @Test
    public void testGetCohortAverage() {

        for(Student student : ) {
            this.Cohort.addGrade();
        }
    }
}
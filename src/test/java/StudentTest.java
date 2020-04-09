import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student danielle;
    ArrayList<Integer> expected;

    @Before
    public void setUp() {
        danielle = new Student("Danielle", 1);
    }

    @Test
    public void testGetName() {
        // Test to see that value was assigned to danielle.name
        assertNotNull("danielle.getName() does not return null", danielle.getName());

        // Test to see if value assigned to danielle.name is Danielle
        assertEquals("danielle.getName() is Danielle", danielle.getName(), "Danielle");
    }

    @Test
    public void testGetId() {
        // Test to see that value as assigned to danielle.id
        assertNotNull("danielle.getId() does not return null", danielle.getId());

        // Test to see if value assigned to danielle.id is 1
        assertEquals("danielle.getId() is 1", danielle.getId(), 1);
    }

    @Test
    public void testGetGrades() {
        // Test to see that danielle.grades is empty ArrayList initially
        assertEquals("danielle.getGrades() is empty ArrayList", danielle.getGrades(), new ArrayList<Integer>());
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> actual = danielle.getGrades();
        danielle.addGrade(90);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(90);

        // Test to see that danielle.grades holds 90
        assertEquals("danielle.grades() at index 0 return a grade of 90", expected.get(0), actual.get(0));
    }

    @Test
    public void testGetGradeAverage () {
        danielle.addGrade(90);
        danielle.addGrade(100);
        // 90 + 100 / 2 = 95 (grade average)

        assertEquals("danielle.getGradeAverage() returns 95", danielle.getGradeAverage(), 95, 0);
    }
}
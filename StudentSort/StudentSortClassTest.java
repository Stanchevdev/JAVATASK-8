package fmi.informatics.StudentSort;

import static org.junit.Assert.assertEquals;

public class StudentSortClassTest {
    @org.junit.Test
    public void concat() {
        StudentSortClass test = new StudentSortClass();
        String result = test.concat("I am", "student");
        assertEquals( "I am student", result);
    }
}
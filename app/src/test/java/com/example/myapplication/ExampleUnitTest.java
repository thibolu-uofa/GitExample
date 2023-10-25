package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void TestStudent() {
        Student student = new Student("Thibaud Lutellier", 2.5);
        assertEquals(2.5, student.getGpa(), 0.001);
        double gpa = 3.3;
        student.setGpa(gpa);
        assertEquals(gpa, student.getGpa(), 0.001);
    }

}
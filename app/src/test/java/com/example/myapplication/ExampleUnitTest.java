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
    public void TestGetNode() {
        Node sampleNode = new Node(5);
        assertEquals(sampleNode.getData(),5);
    }

    @Test
    public void TestSetNode() {
        Node sampleNode = new Node(5);
        sampleNode.setData(10);
        assertEquals(sampleNode.getData(),10);
    }

}
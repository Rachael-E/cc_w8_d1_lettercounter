package com.example.rachael.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    private Counter counter1;

    @Before
    public void before(){
        counter1 = new Counter();
    }

    @Test
    public void canCount(){
        assertEquals(2, counter1.getWordCount("hi"));
    }
}

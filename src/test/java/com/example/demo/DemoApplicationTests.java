package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        assertEquals("Hello", new DemoApplication().getMessage());
    }
}


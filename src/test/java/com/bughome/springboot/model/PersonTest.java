package com.bughome.springboot.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Zgh
 * @Date 2021/1/5 9:46
 */
class PersonTest {

    private Person person = new Person();

    @BeforeEach
    void setUp() {
        person.setLastName("zgh");
        person.setAge(25);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getLastName() {
        System.out.println("getLastName test");
        assertEquals("zgh",person.getLastName());
    }

    @Test
    void getAge() {
        System.out.println("getAge test");
        assertEquals(25,person.getAge());
    }
}
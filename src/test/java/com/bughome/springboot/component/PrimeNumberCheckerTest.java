package com.bughome.springboot.component;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.util.Collection;
import java.util.Arrays;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Zgh
 * @Date 2021/1/5 10:06
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private int inputNumber;
    private boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public PrimeNumberCheckerTest(int inputNumber,boolean expectedResult){
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][]{
                {2,true},
                {5,true},
                {8,false},
                {9,true}
        });
    }

    @Test
    public void primeNumberChecker() {
        System.out.println("test number: "+inputNumber);
        assertEquals(expectedResult,primeNumberChecker.validate(inputNumber));
    }
}
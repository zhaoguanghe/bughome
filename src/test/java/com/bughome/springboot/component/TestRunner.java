package com.bughome.springboot.component;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @Author Zgh
 * @Date 2021/1/5 10:49
 */
public class TestRunner {
    public static void main(String args[]){
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("result: "+result.wasSuccessful());
    }
}

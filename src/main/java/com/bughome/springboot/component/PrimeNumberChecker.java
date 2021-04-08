package com.bughome.springboot.component;

/**
 * @Author Zgh
 * @Date 2021/1/5 10:01
 */
public class PrimeNumberChecker {
    public boolean validate(final int primeNumber){
        for(int i = 2;i < (primeNumber / 2);i++ ){
            if(primeNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}

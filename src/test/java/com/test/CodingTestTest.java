package com.test;

import org.junit.jupiter.api.Test;

import java.util.List;


class CodingTestTest {

    @Test
    public void testArray(){
        String[] s = {"2", "3", "4"};
        CodingTest codingTest = new CodingTest();
        List<String> list = codingTest.letterCombinations(s);
        for (String s1 : list){
            System.out.println(s1);
        }
    }

    @Test
    public void testString(){
        String s = "23";
        CodingTest codingTest = new CodingTest();
        List<String> list = codingTest.letterCombinations(s);
        for (String s1 : list){
            System.out.println(s1);
        }
    }
}
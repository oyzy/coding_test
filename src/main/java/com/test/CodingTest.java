package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ouyangzhiyuan
 */
public class CodingTest {

    private Map<String, String> letterMap = new HashMap<>(10);

    private void initMap() {
        letterMap.put("2","abc");
        letterMap.put("3","def");
        letterMap.put("4","ghi");
        letterMap.put("5","jkl");
        letterMap.put("6","mno");
        letterMap.put("7","pqrs");
        letterMap.put("8","tuv");
        letterMap.put("9","wxyz");
    }

    /**
     * 根据数字数组获取字母组合
     * @param digits 入参
     * @return list
     */
    public List<String> letterCombinations(String[] digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length == 0) {
            return list;
        }
        initMap();
        letterCombinations(list, digits, 0, "");
        return list;
    }

    /**
     * 根据数字字符获取字母组合  
     * @param digits 入参
     * @return list
     */
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        initMap();
        int length = digits.length();
        String [] digitsArray = new String [length];
        //将字符串转为数组
        if (length == 1) {
            digitsArray[0] = digits;
        }else{
            for (int i = 0, len = digits.length(); i < len; i++){
                digitsArray[i] = digits.charAt(i) + "";
            }
        }
        letterCombinations(list, digitsArray, 0, "");
        return list;
    }

    /**
     * 获取字母组合,入参为数组
     * @param list 存放字母组合list
     * @param digits 入参数字数组
     * @param index 下标
     * @param cur 字母组合前缀
     */
    private void letterCombinations(List<String> list, String[] digits, int index, String cur) {
        if (index == digits.length) {
            //说明遍历了一遍了，需要加入list
            list.add(cur);
            return;
        }
        //获取数字所对应的字符串,为null直接返回
        String temp = letterMap.get(digits[index]);
        if(temp == null) {
            return;
        }
        for (int i = 0, len = temp.length(); i < len; i++) {
            String next = cur + temp.charAt(i);
            letterCombinations(list, digits, index + 1, next);
        }
    }



}

package com.mycompany.app;

/**
 * Created by jiangmouren on 6/4/17.
 */

/**
 * Question:
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

/**
 * Analysis:
 * To get linear runtime, use hashmap.
 * If want to avoid extra memory, you have to think about bit manipulation approach: use xor to cancel pairs.
 */


public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}

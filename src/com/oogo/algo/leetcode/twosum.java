package com.oogo.algo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int secondNum = target - nums[i];
      if (map.containsKey(secondNum)) {
        if (map.get(secondNum) > i) {
          return new int[]{i, map.get(secondNum)};
        } else {
          return new int[]{map.get(secondNum), i};
        }
      }
      map.put(nums[i], i);
    }
    return null;
  }
}

package com.github.mritunjayr;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(
                continuousSubarrays(new int[]{5, 4, 2, 4})
        );
    }
    public static long continuousSubarrays( int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int r = 1, l = 0; r < n; ) {
            if (Math.abs(nums[r] - nums[l]) <= 2) {
                arr[r] = r - l;
                r++;
            } else {
                l++;
            }
        }
        for (int l = n - 2, r = n - 1; l >= 0; ) {
            if (Math.abs(nums[r] - nums[l]) <= 2) {
                arr[l] = Math.max(r - l, arr[l]);
                l--;
            } else {
                r--;
            }
        }

        return Arrays.stream(arr).sum();
    }

}

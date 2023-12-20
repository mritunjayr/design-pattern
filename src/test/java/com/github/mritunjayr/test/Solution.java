package com.github.mritunjayr.test;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static class Pair {
        int index;
        int cost;

        public Pair(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
    }

    public long maxScore(int[] nums, int x) {
        int max = nums[0];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, nums[0]));
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int i = curr.index;
            int cost = curr.cost;
            max = Math.max(cost, max);
            boolean even = nums[i] % 2 == 0;
            for (int j = i + 1; j < nums.length; j++) {
                int newCost = 0;
                if ((even && nums[j] % 2 == 0) || (!even && nums[j] % 2 != 0)) {
                    newCost = Math.max(nums[j], cost + nums[j]);
                } else {
                    newCost = Math.max(nums[j], cost + nums[j] - x);
                }
                if (newCost > cost) {
                    queue.add(new Pair(j, newCost));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxScore(new int[]{2, 3, 6, 1, 9, 2}, 5));
    }
}
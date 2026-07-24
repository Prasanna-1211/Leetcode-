import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> major = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            if (major.containsKey(nums[i])) {
                major.put(nums[i], major.get(nums[i]) + 1);
            } else {
                major.put(nums[i], 1);
            }
        } 
        for (int key : major.keySet()) {
            if (major.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1; 
    }
}
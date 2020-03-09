package leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String... args){
        RemoveDuplicates duplicates = new RemoveDuplicates();
//        int[] A = {1};
        int[] A = {0,0,1,1,1,2,2,3,3,4};
//        int[] A = {1,1};
//        int[] A = {1,2};
//        int[] A = {1,1,1};
//        int[] A = {1,1,2};
        System.out.println(duplicates.removeDuplicates(A));
    }

    public int removeDuplicates(int[] nums) {
        int newidx = 0, index = 0, res = 0;
        while(index < nums.length) {
            nums[newidx] = nums[index];
            res++;
            while(index < nums.length - 1 && nums[index] == nums[index + 1]) {
                index++;
            }
            newidx++;
            index++;
        }

        return res;
    }
}

package org.atulk;

public class RunningSum1DArray {
    public static int[] runningSum(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<=i;j++) {
                res[i]=res[i]+nums[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test={1,2,3,4};
        int[] res = runningSum(test);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]+ " ");
        }

    }
}

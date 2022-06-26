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

    public static int[] runningSumImproved(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            ans[i] = ans[i-1] + nums[i];
        return ans;
    }

    public static int[] runningSumInPlace(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i-1] + nums[i];
        return nums;
    }

    public static void main(String[] args) {
        int[] test={1,2,3,4};
        int[] res = runningSum(test);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]+ " ");
        }

        res = runningSumImproved(test);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]+ " ");
        }

        res = runningSumInPlace(test);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]+ " ");
        }
    }
}

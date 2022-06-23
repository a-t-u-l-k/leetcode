package org.atulk;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums) {
            sum+=i;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++) {
            if(i!=0) leftSum+=nums[i-1];
            if(sum-leftSum-nums[i]==leftSum) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int test[] = {1,7,3,6,5,6};
        int pivotIndex = pivotIndex(test);
        System.out.println("pivotIndex - " + pivotIndex + " Pivot Value - " + test[pivotIndex]);
    }
}

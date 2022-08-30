package solution;

import java.util.Arrays;

/**
 * 462. 最少移动次数使数组元素相等 II
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 16:07
 */
public class MinMoves2 {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int avg = 0;
        if(nums.length % 2 == 0){
            avg = nums[nums.length / 2];
        }
        int result = 0;
        for(int num : nums){
            result += Math.abs(num - avg);
        }
        return result;
    }
}

package solution;

import java.util.Arrays;

/**
 * 945. 使数组唯一的最小增量
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/30 15:26
 */
public class MinIncrementForUnique {

    public int minIncrementForUnique1(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i<nums.length - 1;i++){
            while (nums[i+1] <= nums[i]){
                nums[i+1]++;
                count++;
            }
        }
        while (nums[nums.length - 1] <= nums[nums.length - 2]){
            nums[nums.length - 1]++;
            count++;
        }
        return count;
    }

    public int minIncrementForUnique(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length;i++){
            if(nums[i] <= nums[i - 1]){
                int pre = nums[i];
                nums[i] = nums[i - 1]+1;
                result += nums[i] - pre;
            }
        }
        return result;
    }
}

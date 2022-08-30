package solution;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/30 15:44
 */
public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

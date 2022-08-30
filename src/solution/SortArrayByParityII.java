package solution;

/**
 * 922. 按奇偶排序数组 II
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/30 14:37
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityII1(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            while ((((slow&1) == 0 && (nums[slow]&1) == 0) || ((slow&1) == 1 && (nums[slow]&1) == 1)) && slow < nums.length - 1){
                slow++;
            }
            while ((((fast&1) == 0 && (nums[fast]&1) == 0) || ((fast&1) == 1 && (nums[fast]&1) == 1)) && fast < nums.length - 1){
                fast++;
            }
            if(((slow&1) == 0 && (nums[fast]&1) == 0) || ((slow&1) == 1 && (nums[fast]&1) == 1)){
                swap(nums, slow++, fast++);
            }else {
                fast++;
            }
        }
        return nums;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for(int i = 0; i < nums.length;i += 2){
            if((nums[i]&1) ==1){
                while ((nums[j]&1) == 1){
                    j += 2;
                }
                swap(nums, i, j);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

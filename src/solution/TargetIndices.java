package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 10:05
 */
public class TargetIndices {

    public List<Integer> targetIndices1(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int n : nums){
            if(n < target){
                cnt1++;
            }
            if(n == target){
                cnt2++;
            }
        }
        for(int i = cnt1;i < cnt1+cnt2;i++){
            list.add(i);
        }
        return list;
    }
}

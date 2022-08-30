package solution;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 594. 最长和谐子序列
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 10:32
 */
public class FindLHS {

    public int findLHS1(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(int n : map.keySet()){
            if(map.containsKey(n) && map.containsKey(n + 1)){
                result = Math.max(map.get(n) + map.get(n+1), result);
            }
        }
        return result;
    }

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin = 0;
        int result = 0;
        for(int end = 0;end < nums.length;end++){
            while (nums[end] - nums[begin] > 1){
                begin++;
            }
            if(nums[end] - nums[begin] == 1){
                result = Math.max(result, end - begin + 1);
            }
        }
        return result;
    }
}

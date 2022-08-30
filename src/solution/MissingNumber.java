package solution;

/**
 * 268. 丢失的数字
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 14:47
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int [] cnt = new int[nums.length];
        for(int num : nums){
            if(num != nums.length){
                cnt[num]++;
            }
        }
        for(int i = 0;i < cnt.length;i++){
            if(cnt[i] == 0){
                return i;
            }
        }
        return nums.length;
    }
}

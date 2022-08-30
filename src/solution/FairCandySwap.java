package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 888. 公平的糖果交换
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 16:29
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSizeCnt = Arrays.stream(aliceSizes).sum();
        int bobSizeCnt = Arrays.stream(bobSizes).sum();
        int delta = (aliceSizeCnt - bobSizeCnt) / 2;
        Set<Integer> aliceSet = new HashSet<>();
        for(int aliceSize : aliceSizes){
            aliceSet.add(aliceSize);
        }
        int [] result = new int[2];
        for(int y : bobSizes){
            int x = y + delta;
            if(aliceSet.contains(x)){
                result[0] = x;
                result[1] = y;
                break;
            }
        }
        return result;
    }
}

package main;

import solution.*;

/**
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/25 16:15
 */
public class TrainingCampThirdDay {

    public static void main(String[] args) {
        int [] nums = {3};
        String s = "loveleetcode";
        FrequencySort frequencySort = new FrequencySort();
        // System.out.println(frequencySort.frequencySort(s));
        MinIncrementForUnique minIncrementForUnique = new MinIncrementForUnique();
        System.out.println(minIncrementForUnique.minIncrementForUnique(nums));
    }
}

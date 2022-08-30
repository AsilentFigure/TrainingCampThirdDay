package main;

import solution.*;

/**
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/25 16:15
 */
public class TrainingCampThirdDay {

    public static void main(String[] args) {
        int [] nums = {3,2,3,1,2,4,5,5,6};
        String s = "loveleetcode";
        FrequencySort frequencySort = new FrequencySort();
        System.out.println(frequencySort.frequencySort(s));
    }
}

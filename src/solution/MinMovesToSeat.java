package solution;

import java.util.Arrays;

/**
 * 2037. 使每位学生都有座位的最少移动次数
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 10:17
 */
public class MinMovesToSeat {

    public int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0;i < seats.length;i++){
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}

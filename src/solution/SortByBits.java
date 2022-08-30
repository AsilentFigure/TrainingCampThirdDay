package solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 9:31
 */
public class SortByBits {

    public int[] sortByBits(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, countBinaryOne(Integer.toBinaryString(num)));
        }
        Integer[] arrNew = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrNew, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) != map.get(o2)){
                    return map.get(o1) - map.get(o2);
                }else {
                    return o1 - o2;
                }
            }
        });
        for(int i = 0; i< arrNew.length;i++){
            arr[i] = arrNew[i];
        }
        return arr;
    }

    private int countBinaryOne(String num){
        int count = 0;
        char[] numArray = num.toCharArray();
        for(char numA : numArray){
            if('1' == numA){
                count++;
            }
        }
        return count;
    }

    public int get(int x){
        int res = 0;
        while (0 != x){
            res += x % 2;
            x /= 2;
        }
        return res;
    }

}

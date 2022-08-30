package solution;

import java.util.*;

/**
 * 451. 根据字符出现频率排序
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/30 15:47
 */
public class FrequencySort {

    public String frequencySort1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Character[] sChar = new Character[map.size()];
        int i = 0;
        for(Character charS : map.keySet()){
            sChar[i] = charS;
            i++;
        }
        Arrays.sort(sChar, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Character charS : sChar){
            int frequency = map.get(charS);
            for(int j = 0;j<frequency;j++){
                sb.append(charS);
            }
        }
        return sb.toString();
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < list.size();i++){
            for(int j = 0; j < map.get(list.get(i));j++){
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

}

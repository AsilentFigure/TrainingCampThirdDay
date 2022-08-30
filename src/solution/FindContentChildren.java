package solution;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 15:19
 */
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int n = 0;
        for(int j = 0; j < g.length;j++){
            for(int i = n; i < s.length;i++){
                if(s[i] >= g[j]){
                    result++;
                    n = i+1;
                    break;
                }
            }
        }
        return result;
    }
}

package solution;

/**
 * 274. H 指数
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 14:58
 */
public class HIndex {

    public int hIndex(int[] citations) {
        int result = 0;
        int [] cnt = new int[citations.length+1];
        for(int citation : citations){
            cnt[citation]++;
        }
        for(int i = cnt.length - 2;i > -1;i--){
            cnt[i] += cnt[i+1];
        }
        for(int i = 0;i < cnt.length;i++){
            if(cnt[i] >= i){
                result = Math.max(result, i);
            }
        }
        return result;
    }
}

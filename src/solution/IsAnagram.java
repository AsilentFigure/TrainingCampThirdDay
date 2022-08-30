package solution;

/**
 * 242. 有效的字母异位词
 * @author ASilentFigure
 * @project TrainingCampThirdDay
 * @date 2022/8/29 9:37
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s.equals(t)){
            return false;
        }
        int [] charS = new int [27];
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();
        for(char n : sChar){
            charS[(n - 'a')]++;
        }
        for(char n : tChar){
            charS[(n - 'a')]--;
            if(charS[(n - 'a')] < 0){
                return false;
            }
        }
        return true;
    }
}

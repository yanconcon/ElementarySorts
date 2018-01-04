/**
 * Created by 聪聪 on 2017/12/11 0011.
 */
public class DutchNationalFlag {
    private int blueNum;
    private int whiteNum;
    private int redNum;
    public void sortColor(int[]a, int n) {
        if (n == 0) return;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) ++redNum;
            else if (a[i] == 1) ++blueNum;
            else ++whiteNum;
        }
        for (int i = 0; i < a.length; i ++) {
            if(redNum > 0){
                a[i] = 0;
                --redNum;
            }//if
            else if(whiteNum > 0){
                a[i] = 1;
                --whiteNum;
            }//else
            else{
                a[i] = 2;
            }
        }
    }
}

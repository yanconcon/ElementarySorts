import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 聪聪 on 2017/12/11 0011.
 */

//shellsort的实现
public class Permutation {
    public static void sort(Comparable[] a) {
        int h = 0;
        while (h < a.length/3) h = 3 * h + 1;//1, 4, 13, 40, 121
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
                    exch(a, j, j-h);
                }
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) > 0;
    }

    public boolean isSame(Integer[] a, Integer[] b) {
        sort(a);
        sort(b);
        if (a.length != b.length)
        return false;
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {


        }

}

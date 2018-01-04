/**
 * Created by 聪聪 on 2017/12/11 0011.
 */
public class PointSort {
    private Point[] a;
    private Point[] b;
    int count;
    private class Point {
        private int x;
        private int y;
    }
    public PointSort(Point[] a, Point[] b) {
        this.a = a;
        this.b = b;
        count = 0;
    }
    public int count() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].x == b[j].x && a[i].y == b[j].y)
                    count++;
            }
        }
        return count;
    }

}


public class TestPassByRef {

    public static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " ," + y;

        }
    }

    public static void move(Point p) {
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static void main(String[] args) {

        Point p1 = new Point(4, 8);

        System.out.println("P1 (before moving) = " + p1);
        move(p1);
        System.out.println("P1 (after moving) = " + p1); //we changed p1 completely

    }
}

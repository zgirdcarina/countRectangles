import java.util.Objects;

public class Point {
        int x, y;

        //create the constructor
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //we need this to check if 2 points have the same x and y
        @Override
        public boolean equals(Object object) {
            //check if the object is the same as this
            if (object == this)
                return true;
            //check if the object is null
            if (!(object instanceof Point))
                return false;
            //cast the object to a Point
            Point point = (Point) object;
            //check if the x and y are the same
            return point.x == x && point.y == y;
        }

        //generate a different hashcode for each Point
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }




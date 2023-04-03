import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static int CountRectangles(Point[] points){
        int count=0,i,j;
        //create a set of points
        Set<Point> pointSet=new HashSet<>(Arrays.asList(points));
        //loop through the points
        for(i=0;i<points.length;i++)
        {
            //get the first point
            Point p1=points[i];
            //loop through the points again
            for(j=i+1;j<points.length;j++)
            {
                //get the second point
                Point p2=points[j];
                //check if the points are not on the same line
                if(p1.x!=p2.x && p1.y!=p2.y)
                {
                    //check if the points are in the set
                    if(pointSet.contains(new Point(p1.x,p2.y)) && pointSet.contains(new Point(p2.x,p1.y)))
                        //if they are, we have a rectangle
                        count++;
                }
            }
        }
        //return the number of rectangles,we divide by 2 because we count each rectangle twice
        return count/2;

    }

            public static void main(String[] args) {
                //read the points from the file
                List<Point> points = readPointsFromFile("C:\\Users\\Carina\\countRegtangles\\src\\points.txt");
                List<Point> points2 = readPointsFromFile("C:\\Users\\Carina\\countRegtangles\\src\\points2.txt");
                //call the function
                int countRectangles = CountRectangles(points.toArray(new Point[points.size()]));
                int countRectangles2 = CountRectangles(points2.toArray(new Point[points2.size()]));
                  //print the result
                System.out.println("test1: " + countRectangles);
                System.out.println("test2: " + countRectangles2);

            }
            //read the points from the file
            public static List<Point> readPointsFromFile(String fileName) {
                //create a list of points
                List<Point> points = new ArrayList<>();
                //try to read the file
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    //loop through the lines
                    while ((line = br.readLine()) != null) {
                        //split the line by the comma because we have x,y
                        String[] coordinates = line.split(",");
                        //parse the x and y to integers
                        int x = Integer.parseInt(coordinates[0]);
                        int y = Integer.parseInt(coordinates[1]);
                        //add the point to the list
                        points.add(new Point(x, y));
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
                return points;
            }
        }

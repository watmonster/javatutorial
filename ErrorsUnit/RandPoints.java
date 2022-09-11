package ErrorsUnit;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class RandPoints {
    
    public static void main(String[] args){
        //makes some points
        Random rand = new Random();
        ArrayList<Point> points = new ArrayList<Point>();
        for(int i = 0; i < 100; i++){
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            points.add(new Point(x,y));
        }
        System.out.println(points);
        //calls a function to put them in a text file
    }

    public static void writePointsToFile(ArrayList<Point> points){
        //somestuff
    }

}

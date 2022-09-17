package ErrorsUnit;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class RandPoints {
    
    private ArrayList<Point> points;

    

    // public static void writePointsToFile(ArrayList<Point> points){
    //     //somestuff
    // }

    public RandPoints(ArrayList<Point> points){
        this.points = points;
    }

    // public Point center(){
    //     //TODO
    // }

    // public void writeFile(String filePath){
    //     //TODO
    // }

    // public static RandPoints readFile(String filePath){
    //     //TODO
    // }

    public static RandPoints makePoints(int numPoints){
        //makes some points
        Random rand = new Random();
        ArrayList<Point> points = new ArrayList<Point>();
        for(int i = 0; i < numPoints; i++){
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            points.add(new Point(x,y));
        }
        return new RandPoints(points);
    }

    public void printPoints(){
        System.out.println("Here are your points: ");
        System.out.println(this.points);
    }

}

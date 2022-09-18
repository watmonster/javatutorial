package ErrorsUnit;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RandPoints {
    
    private ArrayList<Point> points;

    public RandPoints(ArrayList<Point> points){
        this.points = points;
    }

    public Point2D.Double center(){
        int totalX = 0;
        int totalY = 0;

        for(Point p : this.points){
            totalX += p.x;
            totalY += p.y;
        }

        float centerX = (float)totalX/this.points.size();
        float centerY = (float)totalY/this.points.size();

        return new Point2D.Double(centerX, centerY);
    }

    public void writeFile(String filePath){
        try (PrintWriter pw = new PrintWriter(filePath)) {
            for(Point p: this.points){
                pw.println(p.x + "," + p.y);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

    public static void readFile(String filePath){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line=reader.readLine();
            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

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

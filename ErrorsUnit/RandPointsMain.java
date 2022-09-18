package ErrorsUnit;

public class RandPointsMain {
    
    public static void main(String[] args){
        RandPoints myPoints = RandPoints.makePoints(20);
        myPoints.printPoints();
        System.out.println("Center: ");
        System.out.println(myPoints.center());

        myPoints.writeFile("points.txt");
        RandPoints.readFile("points.txt");
    }

}

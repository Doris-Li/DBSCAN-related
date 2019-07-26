package Cluster;

import java.util.ArrayList;

public class Client {


    public static void main(String[] args) {
//        ArrayList<Point> points = Data.generateSinData(200);
        
//        ArrayList<Point> points = Data.generateSpecialData();
        ArrayList<Point> points = Data.getData("data2d.txt");
        Para para = new Para(points);
        para.calMinPts();
        int pts = para.getMinPts();
        System.out.println(pts);
        ArrayList<Double> klist = para.klistGraph(pts);
 //       pts = 4;
        DBScan dbScan = new DBScan(1.35,pts);
        dbScan.process(points);
//        
//        ArrayList<Point> choice = new ArrayList<Point>();
//        for (Point p:points) {
//        	System.out.println(p);
//           if(p.getX() == 3.95 && p.getY() == -0.691) {
//        	   choice =	dbScan.process(points,p);
//        	   break;
//            }
//        }

        Data.writeData(points,"result2d.txt");
        Data.writeKlist(klist, "g3.txt");

    }

}

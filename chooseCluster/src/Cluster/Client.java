package Cluster;

import java.util.ArrayList;

public class Client {


    public static void main(String[] args) {
        ArrayList<Point> points = Data.generateSinData(200);
        DBScan dbScan = new DBScan(0.6,4);
        //ArrayList<Point> points = Data.generateSpecialData();
//        ArrayList<Point> points = Data.getData("POIData.txt");
//        DBScan dbScan = new DBScan(0.1,1000);
        
        ArrayList<Point> choice = new ArrayList<Point>();
        for (Point p:points) {
        	System.out.println(p);
           if(p.getX() == 3.95 && p.getY() == -0.691) {
        	   choice =	dbScan.process(points,p);
        	   break;
            }
        }

        Data.writeData(choice,"m3.txt");

    }

}

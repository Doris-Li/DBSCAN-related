
package Cluster;

import java.util.ArrayList;


public class DBScan {
    private double radius;
    private int minPts;

    public DBScan(double radius,int minPts) {
        this.radius = radius;
        this.minPts = minPts;
    }

    public ArrayList<Point> process(ArrayList<Point> points, Point cp) {

        int cluster = 1;
        ArrayList<Point> rPoints = new ArrayList<Point>();

        ArrayList<Point> FirstPoints = getAdjacentPoints(cp, points);
        
        for (int k = 0; k < FirstPoints.size(); k++) {
            	Point p = FirstPoints.get(k);
            //choose an unvisited point
            if (!p.getVisit()) {
                p.setVisit(true);//set visited
                ArrayList<Point> adjacentPoints = getAdjacentPoints(p, points);
                //set the point which adjacent points less than minPts noised
                if (adjacentPoints != null && adjacentPoints.size() < minPts) {
                    p.setNoised(true);
                } else {
                    p.setCluster(cluster);
                    for (int i = 0; i < adjacentPoints.size(); i++) {
                        Point adjacentPoint = adjacentPoints.get(i);
                        //only check unvisited point, cause only unvisited have the chance to add new adjacent points
                        if (!adjacentPoint.getVisit()) {
                            adjacentPoint.setVisit(true);
                            ArrayList<Point> adjacentAdjacentPoints = getAdjacentPoints(adjacentPoint, points);
                            //add point which adjacent points not less than minPts noised
                            if (adjacentAdjacentPoints != null && adjacentAdjacentPoints.size() >= minPts) {
                                //adjacentPoints.addAll(adjacentAdjacentPoints);
                                for (Point pp : adjacentAdjacentPoints){
                                    if (!adjacentPoints.contains(pp)){
                                        adjacentPoints.add(pp);
                                    }
                                }
                            }
                        }
                        //add point which doest not belong to any cluster
                        if (adjacentPoint.getCluster() == 0) {
                            adjacentPoint.setCluster(cluster);
                            //set point which marked noised before non-noised
                            if (adjacentPoint.getNoised()) {
                                adjacentPoint.setNoised(false);
                            }
                        }
                    }
                    cluster++;
                    rPoints = adjacentPoints;
                }
            }
        }
     
        return rPoints;
    }

    private ArrayList<Point> getAdjacentPoints(Point centerPoint,ArrayList<Point> points) {
        ArrayList<Point> adjacentPoints = new ArrayList<Point>();
        for (Point p:points) {
            //include centerPoint itself
            double distance = centerPoint.getDistance(p);
            if (distance<=radius) {
                adjacentPoints.add(p);
            }
        }
        return adjacentPoints;
    }

}
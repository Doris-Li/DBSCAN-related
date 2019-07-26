package Cluster;

import java.util.ArrayList;
import java.util.Collections;

public class Para {
	private ArrayList<Point> points;
	private int minPts;
	
	public Para(ArrayList<Point> points) {
		this.points = points;
		minPts = 0;
	}
	
	public void calMinPts() {
		double minSum = 999999999;
		int maxK = 0;
		double sum;
		
		for(int k = 0; k< points.size()-1; k++) {
			sum = 0;
			for (Point p:points) {
				sum += DistanceDiffer(p,k);
			}
			
			if(sum < minSum) {
				minSum = sum;
				System.out.println("#"+k+"	"+minSum);
				maxK = k;
			}
			else {
			break;	
			}
		}
		minPts = maxK+1;
	}
	
	public int getMinPts() {
		return minPts;
	}
	
	public ArrayList<Double> klistGraph(int k){
		
		ArrayList<Double> dis = new ArrayList<Double>();
			
		for (Point p:points) {
				 dis.add(distanceK(p,k));
			}
		
		Collections.sort(dis,Collections.reverseOrder());
		return dis;

	}
	
	public double DistanceDiffer(Point centerPoint, int k) {
		
        ArrayList<Double> dis = new ArrayList<Double>();
        
        for (Point p:points) {
            //include centerPoint itself
            double distance = centerPoint.getDistance(p);
            dis.add(distance);
        }
        
        Collections.sort(dis);
        return dis.get(k+1)-dis.get(k);
    
    }
	
	public double distanceK(Point centerPoint, int k) {
		ArrayList<Double> dis = new ArrayList<Double>();
        
        for (Point p:points) {
            //include centerPoint itself
            double distance = centerPoint.getDistance(p);
            dis.add(distance);
        }
        
        Collections.sort(dis);
        return dis.get(k);
	}
	
}

package Cluster;

public class Point {
    private double x;
    private double y;
    private double z;
    private boolean isVisit;
    private int cluster;
    private boolean isNoised;

    public Point(double x,double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.isVisit = false;
        this.cluster = 0;
        this.isNoised = false;
    }

    public double getDistance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y)
                + (z - point.z) * (z - point.z));
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    
    public void setZ(double z) {
    		this.z = z;
    }
    
    public double getZ() {
        return z;
    }
 
    
    public void setVisit(boolean isVisit) {
        this.isVisit = isVisit;
    }

    public boolean getVisit() {
        return isVisit;
    }

    public int getCluster() {
        return cluster;
    }

    public void setNoised(boolean isNoised) {
        this.isNoised = isNoised;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public boolean getNoised() {
        return this.isNoised;
    }

    @Override
    public String toString() {
        return x+" "+y+" "+z+" "+cluster+" "+(isNoised?1:0);
    }

}
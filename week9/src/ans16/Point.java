package ans16;

public class Point {
    private int x;
    private int y;
    // 1. Constructor without parameter no - arg constructor
    public Point(){
    }
    // 2. Constructor with parameter x & Y
    public Point(int xx, int yy){
        this.x = xx;
        this.y = yy;
    }
    // method to getter and setter

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    // Setter
    public void setX(int x1){
        this.x = x1;
    }
    public void setY(int y1){
        this.y = y1;
    }
    //Method to calculate distance from (0, 0)
    public double distance(){
        return Math.sqrt(x * x + y + y);
    }
    // Method named setX with one parameter oftype int, it needs to set the value of the x field.
    public double distance(int x, int y){
        int xDiff = this.x -x;
        int yDiff = this.y -y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    //Method named setY with one parameter oftype int, it needs to set the value of the y field.
    public double distance(Point another){
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point secound = new Point(3,1);

        System.out.println("Distances(0,0)= "+ first.distance());
        System.out.println("Distances (second)= " + first.distance(secound));
        System.out.println("Distances(0,0)= " + first.distance(2,2));

        Point point1 = new Point();
        System.out.println("Distances()= " + point1.distance());
    }
}

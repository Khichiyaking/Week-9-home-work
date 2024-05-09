package ans17;

public class Calculator {
    private Floor floor1;
    private Carpet carpet1;
    public double getTotalCost(){
        return this.floor1.getArea() * this.carpet1.getCost();
    }
}

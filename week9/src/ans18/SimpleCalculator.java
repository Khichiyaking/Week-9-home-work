package ans18;

public class SimpleCalculator {
    private double firstnumber;
    private double secoundnumber;

    public double getFirstnumber(){
        return this.firstnumber;  }
    public double getSecoundnumber(){
        return this.secoundnumber;  }
    public void setFirstnumber(double firstnumber1){
        this.firstnumber = firstnumber1;  }

    public void setSecoundnumber(double secoundnumber1){
        this.secoundnumber = secoundnumber1;  }

    public double getAdditionResult(){
        return this.firstnumber + this.secoundnumber;  }
    public double getSubtractionResult(){
        return this.firstnumber -   secoundnumber; }
    public double getMultiplicationResult(){
        return this.firstnumber * this.secoundnumber;  }

    public double getDivisionResult(){
        if (this.secoundnumber==0){
            return 0;
        } else {
            return this.firstnumber / this.secoundnumber;   }
    }

    public static void main(String[] args) {
        SimpleCalculator cltr = new SimpleCalculator();
        cltr.setFirstnumber(5.0);
        cltr.setSecoundnumber(4);
        System.out.println("add= " + cltr.getAdditionResult());
        System.out.println("subtract= " + cltr.getSubtractionResult());
        cltr.setFirstnumber(5.25);
        cltr.setSecoundnumber(0);
        System.out.println("multiply= " + cltr.getMultiplicationResult());
        System.out.println("divide= " + cltr.getDivisionResult());
    }

}

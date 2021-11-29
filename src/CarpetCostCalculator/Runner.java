package CarpetCostCalculator;

public class Runner {

    public static void main(String[] args) {
        Carpet carpet=new Carpet(8);
        Floor floor= new Floor(7, 6);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());
    }
}

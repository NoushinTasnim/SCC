public class RedCar implements CarDecorator{
    double cost;

    RedCar(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Color : Red ";
    }

    @Override
    public double cost() {
        return cost;
    }
}
public class WhiteCar implements CarDecorator{
    double cost;

    WhiteCar(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Color : White ";
    }

    @Override
    public double cost() {
        return cost;
    }
}
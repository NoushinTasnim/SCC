public class BlackCar implements CarDecorator{
    double cost;

    BlackCar(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Color : Black ";
    }

    @Override
    public double cost() {
        return cost;
    }
}
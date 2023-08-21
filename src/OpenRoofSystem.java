public class OpenRoofSystem implements CarDecorator {
    private double cost;

    public OpenRoofSystem(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Open roof system";
    }
}
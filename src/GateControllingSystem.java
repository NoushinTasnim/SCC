class MobileBasedControlSystem implements CarDecorator {
    private double cost;

    public MobileBasedControlSystem(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Mobile based control system";
    }
}

class RemoteBasedControlSystem implements CarDecorator {
    private double cost;

    public RemoteBasedControlSystem(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Remote based control system";
    }
}

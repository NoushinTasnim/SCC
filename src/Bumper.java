class TightBumper implements CarDecorator {
    private double cost;

    public TightBumper(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Tight Bumper";
    }
}

class LooseBumper implements CarDecorator {
    private double cost;

    public LooseBumper(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Loose Bumper";
    }
}
class LowPoweredAC implements CarComponent{
    private double cost;

    public LowPoweredAC(double cost) {
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "AC : Low Powered ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}
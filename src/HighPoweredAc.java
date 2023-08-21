class HighPoweredAC implements CarComponent{
    
    private double cost;

    public HighPoweredAC(double cost) {
        this.cost = cost;
    }
    
    @Override
    public String getName() {
        return "AC : High Powered ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

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
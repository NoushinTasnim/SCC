class HighPoweredAC implements AC{
    
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
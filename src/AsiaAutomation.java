class AsiaAutomation implements Automation{

    double cost;

    AsiaAutomation(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Driving using Asia-based AI strategy";
    }

    @Override
    public double cost() {
        return cost;
    }
}
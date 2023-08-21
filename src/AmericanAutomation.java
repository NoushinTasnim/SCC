class AmericaAutomation implements CarComponent{

    double cost;
    
    AmericaAutomation(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Driving using USA-based AI strategy";
    }

    @Override
    public double cost() {
        return cost;
    }
}
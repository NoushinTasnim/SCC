class Ferrari implements CarComponent{

    double cost;

    Ferrari(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Company : BMW";
    }

    @Override
    public double cost() {
        return cost;
    }
}
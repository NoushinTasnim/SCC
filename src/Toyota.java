class Toyota implements CarComponent{

    double cost;

    Toyota(double cost){
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
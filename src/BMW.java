class BMW implements BodyDesign{

    double cost;

    BMW(double cost){
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
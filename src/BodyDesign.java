class Fords implements CarComponent{
    double cost;

    Fords(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Company : Fords ";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class Ferrari implements CarComponent{
    double cost;

    Ferrari(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Company : Ferrari";
    }

    @Override
    public double cost() {
        return cost;
    }
}
class Toyota implements CarComponent{
    double cost;

    Toyota(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Company : Toyota";
    }

    @Override
    public double cost() {
        return cost;
    }
}
class BMW implements CarComponent{
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

class Chevrolet implements CarComponent{
    double cost;

    Chevrolet(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Company : Chevrolet";
    }

    @Override
    public double cost() {
        return cost;
    }
}
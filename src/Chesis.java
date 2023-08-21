class Tabular implements CarComponent{
    double cost;

    Tabular(double cost){
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Chesis : Tabular ,";
    }
}

class Backbone implements CarComponent{
    double cost;

    Backbone(double cost){
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Chesis : Backbone";
    }
}

class LadderFrame implements CarComponent{
    double cost;

    LadderFrame(double cost){
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Chesis : LadderFrame";
    }
}
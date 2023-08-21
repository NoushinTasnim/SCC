public interface Chesis extends CarComponent{

}

class Tabular implements Chesis{
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

class Backbone implements Chesis{
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

class LadderFrame implements Chesis{
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
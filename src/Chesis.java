abstract class Chesis implements CarComponent{

}

class Tabular extends Chesis{
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

class Backbone extends Chesis{
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

class LadderFrame extends Chesis{
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
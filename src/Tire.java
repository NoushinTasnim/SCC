public interface Tire extends CarComponent{
    
}

class Snow implements Tire{

    double cost;

    Snow(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Tire : Snow ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class Spare implements Tire{

    double cost;

    Spare(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Tire : Spare ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class Whitewall implements Tire{

    double cost;

    Whitewall(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Tire : Whitewall ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class Slick implements Tire{

    double cost;

    Slick(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Tire : Slick";
    }

    @Override
    public double cost() {
        return cost;
    }
}
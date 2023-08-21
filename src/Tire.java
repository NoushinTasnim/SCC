class Snow implements CarComponent{

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

class Spare implements CarComponent{

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

class Whitewall implements CarComponent{

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

class Slick implements CarComponent{

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
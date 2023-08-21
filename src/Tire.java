abstract class Tire implements CarComponent{
    
}

class Snow extends Tire{

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

class Spare extends Tire{

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

class Whitewall extends Tire{

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

class Slick extends Tire{

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
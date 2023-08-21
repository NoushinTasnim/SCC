class RacingCarSeat implements CarComponent{
    double cost;

    RacingCarSeat(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Total Seats : 1" ;
    }

    @Override
    public double cost() {
        return cost;
    }
}

class PrivateCarSeat implements CarComponent{
    double cost;

    PrivateCarSeat(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Total Seats : 5";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class SUVCarSeat implements CarComponent{
    double cost;

    SUVCarSeat(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Total Seats : 15";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class MilitaryCarSeat implements CarComponent{
    double cost;

    MilitaryCarSeat(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Total Seats : 7";
    }

    @Override
    public double cost() {
        return cost;
    }
}

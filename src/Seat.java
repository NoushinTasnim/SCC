public interface Seat extends CarComponent{

}

class RacingCarSeat implements Seat{
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

class PrivateCarSeat implements Seat{
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

class SUVCarSeat implements Seat{
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

class MilitaryCarSeat implements Seat{
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

public interface Engine extends CarComponent{

}

class CC1300 implements Engine{

    double cost;

    CC1300(double cost){
        this.cost = cost;
    }

    @Override
    public String getName() {
        return "Engine : 1300CC ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class CC1700 implements Engine{

    double cost;

    CC1700(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Engine : 1700CC ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class CC1800 implements Engine{

    double cost;

    CC1800(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Engine : 1800CC ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}

class CC2100 implements Engine{

    double cost;

    CC2100(double cost){
        this.cost = cost;
    }
    @Override
    public String getName() {
        return "Engine : 2100CC ,";
    }

    @Override
    public double cost() {
        return cost;
    }
}
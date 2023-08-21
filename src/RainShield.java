class ThickRainShield implements CarDecorator {
    private double cost;

    public ThickRainShield(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Thick rain shield";
    }
}

class ThinRainShield implements CarDecorator {
    private double cost;

    public ThinRainShield(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Thin rain shield";
    }
}

class CurvedRainShield implements CarDecorator {
    private double cost;

    public CurvedRainShield(double cost) {
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getName() {
        return "Customization: Curved rain shield";
    }
}
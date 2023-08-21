public class BMWGroup extends CarGroup {
    @Override
    public Car createCar(CarType carType) {
        Car car = new Car(carType);

        car.addComponent(new CC2100(10000));
        car.addComponent(new Slick(1000));
        car.addComponent(new HighPoweredAC(1200));
        car.addComponent(new LadderFrame(1000));

        return car;
    }

    @Override
    public CarShop createShop(Location location) {
        if (location == Location.ASIA) {
            return new AsiaCentricShop();
        } else if (location == Location.USA) {
            return new USACentricShop();
        }
        return null;
    }
}

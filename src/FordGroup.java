public class FordGroup extends CarGroup {
    @Override
    public Car createCar(CarType carType) {
        Car car = new Car(carType);

        car.addComponent(new CC1800(8000));
        car.addComponent(new Slick(1000));
        car.addComponent(new HighPoweredAC(1000));
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

public class Main {
    public static void main(String args[]){
        FerrariGroup ferrariGroup = new FerrariGroup();
        CarShop ferrariShop = ferrariGroup.createShop(Location.ASIA);
        CarShop ferrariShop2 = ferrariGroup.createShop(Location.USA);

        Car ferrariCar = ferrariGroup.createCar(CarType.RACING);

        // Add basic components to the car
        ferrariCar.addComponent(new CC1300(5000));
        ferrariCar.addComponent(new Slick(1000));
        ferrariCar.addComponent(new LowPoweredAC(500));
        ferrariCar.addComponent(new LadderFrame(1000));
        ferrariCar.addComponent(new AmericaAutomation(1000));

        // Add customizations to the car
        ferrariCar.addCustomization(new ThickRainShield(200));
        ferrariCar.addCustomization(new LooseBumper(300));
        ferrariCar.addCustomization(new MobileBasedControlSystem(400));
        ferrariCar.addCustomization(new OpenRoofSystem(1000));

        // Describe and calculate the total cost of the car
        ferrariCar.describeCar();

        ferrariShop.sellCar(ferrariCar);
        ferrariShop2.sellCar(ferrariCar);
    }
}

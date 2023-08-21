import java.util.ArrayList;
import java.util.List;

public class Car implements Subject{
    private CarType carType;
    private List<CarComponent> components = new ArrayList<>();
    private List<CarDecorator> customizations = new ArrayList<>();
    private List<Subscriber> subscribers = new ArrayList<>();

    public Car(CarType carType) {
        this.carType = carType;
    }

    public void addComponent(CarComponent component) {
        components.add(component);
    }

    public void addCustomization(CarDecorator customization) {
        customizations.add(customization);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (CarComponent component : components) {
            totalCost += component.cost();
        }
        for (CarDecorator customization : customizations) {
            totalCost += customization.cost();
        }
        return totalCost;
    }

    public void describeCar() {
        System.out.println("Car Configuration for " + carType + ":");
        for (CarComponent component : components) {
            System.out.println(component.getName());
        }
        System.out.println("Customizations:");
        for (CarDecorator customization : customizations) {
            System.out.println(customization.getName());
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(NotificationType notificationType) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(notificationType);
        }
    }

    public static void main(String args[]){
        FerrariGroup ferrariGroup = new FerrariGroup();
        ferrariGroup.createCar(CarType.RACING);
        ferrariGroup.createShop(Location.ASIA);

        Car ferrariCar = ferrariGroup.createCar(CarType.RACING);

        // Add basic components to the car
        ferrariCar.addComponent(new CC1300(5000));
        ferrariCar.addComponent(new Slick(1000));
        ferrariCar.addComponent(new LowPoweredAC(500));
        ferrariCar.addComponent(new LadderFrame(1000));

        // Add customizations to the car
        ferrariCar.addCustomization(new ThickRainShield(200));
        ferrariCar.addCustomization(new LooseBumper(300));
        ferrariCar.addCustomization(new MobileBasedControlSystem(400));
        ferrariCar.addCustomization(new OpenRoofSystem(1000));

        // Describe and calculate the total cost of the car
        ferrariCar.describeCar();
    }
}
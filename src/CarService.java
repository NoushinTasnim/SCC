import java.util.Date;

class CarService {
    public void requestService(Client client) {
        System.out.println("Service requested");
    }
}

class CarWashService {
    public void requestWashing(Client client, Date date) {
        System.out.println("Washing requested");
    }
}

class OnlineDeliveryService {
    public void requestDelivery(Client client) {
        System.out.println("Delivery requested");
    }
}

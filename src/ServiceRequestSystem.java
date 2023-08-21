import java.util.Date;

public class ServiceRequestSystem {
    private CarService carService;
    private CarWashService carWashService;
    private OnlineDeliveryService onlineDeliveryService;

    public ServiceRequestSystem() {
        carService = new CarService();
        carWashService = new CarWashService();
        onlineDeliveryService = new OnlineDeliveryService();
    }

    public void requestCarServicing(Client client) {
        carService.requestService(client);
    }

    public void requestCarWashing(Client client, Date date) {
        carWashService.requestWashing(client, date);
    }

    public void requestOnlineDelivery(Client client) {
        onlineDeliveryService.requestDelivery(client);
    }
}

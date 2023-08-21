import java.util.Date;

public class MobileAppMiddleware {
    private ServiceRequestSystem serviceRequestSystem;

    public MobileAppMiddleware() {
        serviceRequestSystem = new ServiceRequestSystem();
    }

    public void requestCarServicing(Client client) {
        serviceRequestSystem.requestCarServicing(client);
    }

    public void requestCarWashing(Client client, Date date) {
        serviceRequestSystem.requestCarWashing(client, date);
    }

    public void requestOnlineDelivery(Client client) {
        serviceRequestSystem.requestOnlineDelivery(client);
    }
}
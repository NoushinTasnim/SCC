import java.sql.Date;

public class MobileApplication {
    public static void main(String[] args) {
        MobileAppMiddleware mobileApp = new MobileAppMiddleware();

        Client client = new Client("John");
        Date washingDate = new Date(20/12/2023); // Specify washing date

        mobileApp.requestCarServicing(client);
        mobileApp.requestCarWashing(client, washingDate);
        mobileApp.requestOnlineDelivery(client);
    }
}

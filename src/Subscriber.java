public interface Subscriber {
    void update(NotificationType notificationType);
}

class Client implements Subscriber {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(NotificationType notificationType) {
        System.out.println("Notification received by " + name + ": " + notificationType);
    }
}
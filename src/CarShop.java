public abstract class CarShop {
    public abstract void sellCar(Car car);
}

class AsiaCentricShop extends CarShop {
    @Override
    public void sellCar(Car car) {
        System.out.println("Sells Asia-centric cars");
    }
}

class USACentricShop extends CarShop {
    @Override
    public void sellCar(Car car) {
        System.out.println("Sells USA-centric cars");
    }
}

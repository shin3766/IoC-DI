public class Driver {

    void drive(Car car) {
        car.drive();
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Ferrari());
        driver.drive(new Porsche());
    }
}

interface Car {
    void drive();
}

class Ferrari implements Car {
    @Override
    public void drive() {
        System.out.println("페라리를 운전한다! 야호!");
    }
}

class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("포르쉐를 운전한다! 끼얏호!");
    }
}
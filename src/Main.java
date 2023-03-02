public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", 2020, 10000, "red", 200);
        car.getInfo();
        car.road("Строителей, 15");
        car.start();
        car.road("Строителей, 15");
        car.stop();
        car.road("Строителей, 15");
        car.addRoadList("Строителей, 15");
        car.addRoadList("Ленина, 25");
        car.addRoadList("Циолковского, 3");
        car.printRoadList();
        car.drive();
    }
}
public class Vehicle {
  int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public void run() {
    System.out.println(this.speed + "km/h で走行中");
  }

public class Car extends Vehicle {
  public Car(int speed) {
    super(speed);
  }

  @Override
  public void run() {
    System.out.println(this.speed + "km/h で車が走行中");
  }
}

public class Bicycle extends Vehicle {
  public Bicycle(int speed) {
    super(speed);
  }

  @Override
  public void run() {
    System.out.println(this.speed + "km/h で自転車が走行中");
  }
}

public class Main {
  public static void main(String[] args) {
    // create an instance of Vehicle
    Vehicle veh = new Vehicle(60);
    veh.run();

    // create an instance of Car
    Car car = new Car(100);
    car.run();

    // create an instance of Bicycle
    Bicycle bic = new Bicycle(20);
    bic.run();
  }
}

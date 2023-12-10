class Car {
private String brand;
private String model;

public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
}

public String getBrand() {
    return brand;
}

public String getModel() {
    return model;
}
}

class CarShowroom {
    private Car[] cars;

    public CarShowroom() {
        cars = new Car[]{
                new Car("Toyota", "Camry"),
                new Car("Honda", "Civic"),
                new Car("Suzuki", "Swift")
        };


    }

    public void displayShowroom() {
        System.out.println("Welcome to the Car Showroom!");

        System.out.println("Total Cars in the Showroom: " + cars.length);

//        for (int i = 0; i < size; i++) {
//            Car car = cars[i];
        for(Car car:cars)
            System.out.println("Brand: " + car.getBrand() + ", Model: " + car.getModel());
        }

    }



public class Main
{
    public static void main(String[] args) {
        CarShowroom cs = new CarShowroom();

        cs.displayShowroom();
    }
}

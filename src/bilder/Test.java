package bilder;

import bilder.car_builder.Car;
import bilder.car_builder.CarBuilder;

public class Test {
    public static void main(String[] args) {
        Car a = new CarBuilder(1, "Car")
                .withColor("Red")
                .withModel("BMW X5")
                .withNumbersOfDoors(4)
                .build();
    }
}

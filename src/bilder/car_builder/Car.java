package bilder.car_builder;

public class Car {
    private final int id;
    private final String model;
    private final String name;
    private final int weight;
    private final String color;
    private final int numbersOfDoors;

    public Car(CarBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.model = builder.getModel();
        this.weight = builder.getWeight();
        this.color = builder.getColor();
        this.numbersOfDoors = builder.getNumbersOfDoors();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = ")
                .append(id)
                .append(", name = ")
                .append(name);

        if (model != null) stringBuilder
                .append(", model = ")
                .append(model);

        if (weight != 0 && weight > 0) stringBuilder
                .append(", weight = ")
                .append(weight);

        if (color != null) stringBuilder
                .append(", color = ")
                .append(color);

        if (numbersOfDoors != 0 && numbersOfDoors > 0) stringBuilder
                .append(", numbersOfDoors = ")
                .append(numbersOfDoors);

        return stringBuilder.toString();
    }
}


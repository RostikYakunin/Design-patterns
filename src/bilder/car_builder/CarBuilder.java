package bilder.car_builder;

public class CarBuilder {
        private final int id;
        private final String name;
        private String model;
        private int weight;
        private String color;
        private int numbersOfDoors;

        public CarBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withNumbersOfDoors(int numbersOfDoors) {
            this.numbersOfDoors = numbersOfDoors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getModel() {
            return model;
        }

        public int getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }

        public int getNumbersOfDoors() {
            return numbersOfDoors;
        }
}

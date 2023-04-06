public class Car {
    private static int totalNumOfCars;

    private String brand;
    private String colour;
    private Double volume;
    private Integer maxSpeed;

    public Car(String brand) {
        this.brand = brand;
        totalNumOfCars++;
    }

    public Car(String brand, String colour) throws StrangeColourException {
        this(brand);
        if ("gold".equalsIgnoreCase(colour)) {
            throw new StrangeColourException("Seriously??? Do you really want GOLD " + brand);
        }
        this.colour = colour;
    }

    public Car(String brand, String colour, Double volume) throws StrangeColourException {
        this(brand, colour);
        this.volume = volume;
    }

    public Car(String brand, String colour, Double volume, Integer maxSpeed) throws StrangeColourException {
        this(brand, colour, volume);
        this.maxSpeed = maxSpeed;
    }

    public void changeColour(String newColour) throws StrangeColourException {
        if ("gold".equalsIgnoreCase(newColour)) {
            throw new StrangeColourException("Seriously??? Do you really want GOLD " + brand);
        }
        colour = newColour;
    }

    public static void printCars(Car... cars) {
        System.out.println("Total number of created cars: " + totalNumOfCars);
        System.out.println("List of cars:");
        int i = 1;
        for (Car car : cars) {
            System.out.println(i + ". Brand: " + car.brand + " Colour: " + car.colour + " Engine volume: " + car.volume + " l Maximum speed: " + car.maxSpeed + " km/h");
            i++;
        }
    }
}

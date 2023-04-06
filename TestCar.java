
    public class TestCar {

        public static void main(String[] args) {
            try {
                Car car1 = new Car("Subaru");
                Car car2 = new Car("Toyota", "Dark grey");
                Car car3 = new Car("Mazda", "Red", 2.4);
                Car car4 = new Car("Honda", "White", 2.0, 250);
                Car car5 = new Car("Mitsubishi", "Blue", 2.0, 300);
                Car car6 = new Car("Nissan", "Silver", 1.6);
                Car car7 = new Car("Ferrari", "Gold");
                Car car8 = new Car("BMW", "Black", 3.0);


                car5.changeColour("Red");
                car7.changeColour("Gold");

                Car.printCars(car1, car2, car3, car4, car5, car6);
            } catch (StrangeColourException e) {
                System.out.println(e.getMessage());
            }
        }
    }


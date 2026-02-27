import java.util.ArrayList;

public class Train implements TrainRequirements{
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for(int i = 0; i < nCars; i++){
        Car newCar = new Car(passengerCapacity);
        this.cars.add(newCar);
        }
    }

    public void printManifest(){
        for (Car c : this.cars){
            c.printManifest();
        }
    }
    public int seatsRemaining(){
        int total =0;
        for (Car c: this.cars){
            total = total + c.seatsRemaining();
        }
        return total;
    }  
    public Engine getEngine(){
        return this.engine;
    }   
    public Car getCar(int i){
        return this.cars.get(i);
    }  
    
    public int getMaxCapacity(){
        int total=0;
        for(Car c: this.cars){
            total = total + c.getCapacity();
        }
        return total;
    }

    public static void main(String[] args) {
    // 1. Create a Train: Steam engine, 3 cars, each car holds 2 people
    Train myTrain = new Train(FuelType.STEAM, 100.0, 100.0, 3, 2);

    // 2. Create some Passengers
    Passenger p1 = new Passenger("Alice");
    Passenger p2 = new Passenger("Bob");
    Passenger p3 = new Passenger("Charlie");

    // 3. Try to board the first car (index 0)
    System.out.println("--- Boarding ---");
    p1.boardCar(myTrain.getCar(0));
    p2.boardCar(myTrain.getCar(0));
    
    // 4. Try to board a full car (p3 should fail)
    p3.boardCar(myTrain.getCar(0)); 

    // 5. Check the status
    System.out.println("\n--- Train Status ---");
    System.out.println("Remaining seats: " + myTrain.seatsRemaining());
    myTrain.printManifest();
    }
}




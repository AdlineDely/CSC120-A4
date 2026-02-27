public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println("Sucess! " + this.name + " is now on the car.");
        } else{
            System.out.println("Wait! This car is full. " + this.name + " could not board.");
        }
    }
    public void getOffCar(Car c){
        if(c.removePassenger(this)){
            System.out.println(this.name + " has successfully departed the car.");
        } else{
            System.out.println("Error: " + this.name + " was not found on this car!");
        }
    }    
}

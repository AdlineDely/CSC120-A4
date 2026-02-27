 import java.util.ArrayList;
 public class Car implements CarRequirements{
    private ArrayList<Passenger> passengers;
    private int capacity;

    public Car(int capacity){
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>(); //this initiate a list so that passenger can be added to it
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int seatsRemaining(){
        return this.capacity - this.passengers.size();
    }

    public Boolean addPassenger(Passenger p){
        //if yes seatsRemaining is greater than 0
        if (this.seatsRemaining() > 0){
            this.passengers.add(p);
            return true;
        } else{
            return false;
        }
    }
    public Boolean removePassenger(Passenger p){
    //if yes seatsRemaining is greater than 0
        if (this.passengers.contains(p)){
            this.passengers.remove(p);
            return true;
        } else{
            return false;
        }
        
    }
    public void printManifest(){
        if(this.passengers.size() == 0){
         System.out.println("This car is empty!");  
        } else {
            for(Passenger p : this.passengers){
                System.out.println(p);
            }
        }
    }

}
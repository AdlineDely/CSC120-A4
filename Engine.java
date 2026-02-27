public class Engine implements EngineRequirements{
//Attributes 
private FuelType fType; //the kind of energy it use
private double currentLevel; //the amount of fuel in the tank right now
private double maxFuel; // the size of the tank

//constructor
public Engine(FuelType fType, double currentLevel, double maxFuel){
    this.fType = fType;
    this.currentLevel= currentLevel;
    this.maxFuel= maxFuel;
}
// Methods ( get, go, and refuel)
public double getCurrentFuel(){
    return this.currentLevel;
    }
public FuelType getFuelType(){
    return this.fType;
    }
public double getMaxFuel(){
    return this.maxFuel;
    }
public Boolean go(){
    if (this.currentLevel > 0){
        this.currentLevel -= 1.0;
        System.out.println("Current Fuel Level: " + this.currentLevel);
        return true;
    } else{
        return false;
    }
    }
public void refuel(){
    this.currentLevel = this.maxFuel;
}
public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 50.0, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}
}


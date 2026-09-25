package DesignPatterns;

interface Vehicle{
    void run();
}

class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car run");
    }
}

class Bike implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bike run");
    }
}

class VehicleFactory{
    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("CAR")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        return null;
    }
}


public class FactoryDesignPattern {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("BIKE");
        v1.run();
        Vehicle v2 = VehicleFactory.getVehicle("CAR");
        v2.run();
    }
}

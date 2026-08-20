public class PickMe {
    public static void main(String[] args) {
        vehicle v1 = new Car();
        vehicle v2 = new TukTuk();
        vehicle v3 = new Bike();

        vehicle [] vehicles = new vehicle[3];
        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = v3;

        for(vehicle v : vehicles){
           double fee = v.calculateFare(100,false);
            System.out.println(fee);
        }

    }
}


class TukTuk extends vehicle{

    @Override
    public double calculateFare(double distance, boolean isSurge) {
        return (100 + distance *80) * (isSurge ? 1.2:1.0);
    }
}

class Car extends vehicle{

    @Override
    public double calculateFare(double distance, boolean isSurge) {
        return (200 + distance *150) * (isSurge ? 1.5:1.0);

    }
}

class Bike extends vehicle{

    @Override
    public double calculateFare(double distance, boolean isSurge) {
        return 50 + distance * 50;
    }
}
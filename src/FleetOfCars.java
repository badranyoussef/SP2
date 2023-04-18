import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int sumOfTotalFeeForFleet = 0;

        for(Car f: fleet) {
            int fee = fleet.get(1).getRegistrationFee();
            sumOfTotalFeeForFleet += fee;
        }
        System.out.println("The total amoun of registration for alle cars is: "+sumOfTotalFeeForFleet);
        return sumOfTotalFeeForFleet;
    }
}

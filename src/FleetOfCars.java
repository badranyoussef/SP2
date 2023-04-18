import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int sumOfTotalFeeForFleet = 0;
        for (Car car : fleet) {
            int fee = car.getRegistrationFee();
            sumOfTotalFeeForFleet += fee;
        }
        System.out.println("The total registration fee for all cars is: "+sumOfTotalFeeForFleet);
        return sumOfTotalFeeForFleet;
    }
}

public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, String registrationNumber) {
        super(numberOfDoors, model, make, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee() {

        /*
            double khwToKM = 100/(batteryCapacity/91.25); fremfor metoder kunne denne
            simpel regnestykke benyttes
         */

        int registrationFee = 0;
        if (khwToKM() >= 20 && khwToKM() < 100) {
            registrationFee = 330;
        } else if (khwToKM() >= 15 && khwToKM() < 20) {
            registrationFee = 1050;
        } else if (khwToKM() >= 10 && khwToKM() < 15) {
            registrationFee = 2340;
        } else if (khwToKM() >= 5 && khwToKM() < 10) {
            registrationFee = 5000;
        } else if (khwToKM() < 5) {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }
    public int getMaxRangeKm(){ //returns the maximum range in kilometres.
            return maxRange;
    }
    // returns the power consumption in watt hours per driven kilometre.
    public int khwToKM(){
        return (int) (100/(batteryCapacity/91.25));
    }

    @Override
    public String toString(){
        return "Information about the car:" +
                "\nBrand: "+getMake()+
                "\nModel: "+getModel()+
                "\nMax KM Range: "+getMaxRangeKm()+
                "\nNumber of doors: "+getNumberOfDoors()+
                "\nRegistration fee: "+getRegistrationFee()+
                "\n";
    }
}

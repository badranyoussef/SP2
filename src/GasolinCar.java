public class GasolinCar extends AFuelCar {


    public GasolinCar(String make, String model, int numberOfDoors, int kmPrLitre, String registrationNumber) {
        super(numberOfDoors, model, make, kmPrLitre, registrationNumber);
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50) {
            registrationFee = 330;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee = 5000;
        } else if (getKmPrLitre() < 5) {
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString(){
        return "Information about the car:" +
                "\nBrand: "+getMake()+
                "\nModel: "+getModel()+
                "\nFuel type: "+getFuelType()+
                "\nNumber of doors: "+getNumberOfDoors()+
                "\nRegistration fee: "+getRegistrationFee()+
                "\n";
    }
}

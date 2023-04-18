public class DieselCar extends AFuelCar {

    private boolean hasParticleFiltre = false;
    private int noPartikelFiltreFee = 1000;

    public DieselCar(String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFiltre, String registrationNumber) {
        super(numberOfDoors, model, make, kmPrLitre, registrationNumber);
        this.hasParticleFiltre = hasParticleFiltre;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50) {
            registrationFee = 330 + 130;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050 + 1390;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340 + 1850;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee = 5000 + 2770;
        } else if (getKmPrLitre() < 5) {
            registrationFee = 10470 + 15260;
        }

        if (hasParticleFiltre) {
            registrationFee += noPartikelFiltreFee;
        }

        return registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return true;
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

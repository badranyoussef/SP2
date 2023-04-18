public abstract class AFuelCar extends ACar {

    private int kmPrLitre;

    public AFuelCar(int numberOfDoors, String model, String make, int kmPrLitre, String registrationNumber) {
        super(numberOfDoors, model, make, registrationNumber);
        this.kmPrLitre = kmPrLitre;
    }


    public abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return getFuelType();
    }

}

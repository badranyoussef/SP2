public abstract class ACar implements Car{

    private String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;


    public ACar(int numberOfDoors, String model, String make, String registrationNumber){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.registrationNumber = registrationNumber;
    }


    public String getRegistrationNumber(){
        return "";
    }

    public String getModel(){
        return model;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    @Override
    public String toString(){
        return "Information about the car:\nBrand: "+getMake()+"\nModel: "+getModel()+"\nNumber of doors: "+getNumberOfDoors();
    }

    public String getMake() {
        return make;
    }

}

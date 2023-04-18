public class Main {
    public static void main(String[] args) {

        GasolinCar a = new GasolinCar("Audi","A6",5,26, "AS87654");
        GasolinCar b = new GasolinCar("Mercedes","C200",4,18,"FG55454");
        GasolinCar c = new GasolinCar("Ford","Mondeo",4,22,"KM98674");

        DieselCar d = new DieselCar("Peugeot","308",4,15,false, "LM11354");
        DieselCar e = new DieselCar("Peugeot","5008",5,29, true, "DC28463");
        DieselCar f = new DieselCar("Opel","Insignia",4,31, true, "AA22334");

        ElectricCar g = new ElectricCar("Tesla","X",5,170,500, "HJ87987");
        ElectricCar h = new ElectricCar("Tesla","Y",5,100,400, "AH77887");
        ElectricCar i = new ElectricCar("Tesla","S",5,50,200, "AH77887");

        FleetOfCars cars = new FleetOfCars();

        cars.fleet.add(a);
        cars.fleet.add(b);
        cars.fleet.add(c);
        cars.fleet.add(d);
        cars.fleet.add(e);
        cars.fleet.add(f);
        cars.fleet.add(g);
        cars.fleet.add(h);
        cars.fleet.add(i);

        for (int x = 0 ; x< cars.fleet.size(); x++) {
            System.out.println(cars.fleet.get(x).toString());
        }

        cars.getTotalRegistrationFeeForFleet();

    }
}
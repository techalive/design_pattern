package a_creational.builder_demo.car;

public class CarMain {
    public static void main(String[] args) {

        // TO DO: build sport car
        Car sportCar = null;

        System.out.println("Engine type: " + sportCar.getEngineType());
        System.out.println("Engine volume: " + sportCar.getEngineVolume());
        System.out.println("EnginePower: " + sportCar.getEnginePower());
        System.out.println("Gearbox type: " + sportCar.getGearboxType());
        System.out.println("Doors count: " + sportCar.getDoorsCount());
        System.out.println("Trunk volume: " + sportCar.getTrunkVolume());


        // TO DO: build family car
        Car familyCar = null;

        System.out.println("Engine type: " + familyCar.getEngineType());
        System.out.println("Engine volume: " + familyCar.getEngineVolume());
        System.out.println("EnginePower: " + familyCar.getEnginePower());
        System.out.println("Gearbox type: " + familyCar.getGearboxType());
        System.out.println("Doors count: " + familyCar.getDoorsCount());
        System.out.println("Trunk volume: " + familyCar.getTrunkVolume());

    }
}

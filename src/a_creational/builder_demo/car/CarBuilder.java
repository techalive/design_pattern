package a_creational.builder_demo.car;

public interface CarBuilder {
    CarBuilder setEngineType(String engineType);
    CarBuilder setEngineVolume(float engineVolume);
    CarBuilder setEnginePower(int enginePower);
    CarBuilder setTrunkVolume(int trunkVolume);
    CarBuilder setDoorsCount(int doorsCount);
    CarBuilder setGearboxType(String gearboxType);
    Car build();
}

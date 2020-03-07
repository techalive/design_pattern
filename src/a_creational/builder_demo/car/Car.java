package a_creational.builder_demo.car;

//TO TO
public interface Car {
    String getEngineType(); // diesel / petrol / lpg
    float getEngineVolume(); // 1.0, 1.6 etc
    int getEnginePower(); // for. ex. 90, 125 (km)
    int getTrunkVolume();
    int getDoorsCount();
    String getGearboxType(); // manual / auto
}

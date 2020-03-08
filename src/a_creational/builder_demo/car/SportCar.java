package a_creational.builder_demo.car;

//TO DO: zaimplementuj klasę SportCar na podsatwie interfejsu car
public class SportCar implements Car {
    private String engineType;
    private float engineVolume;
    private int enginePower;
    private int trunkVolume;
    private int doorsCount;
    private String gearboxType;

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public int getTrunkVolume() {
        return trunkVolume;
    }

    @Override
    public int getDoorsCount() {
        return doorsCount;
    }

    @Override
    public String getGearboxType() {
        return gearboxType;
    }

    private SportCar(SportCarBuilder carBuilder) {
        this.engineType = carBuilder.engineType;
        this.engineVolume = carBuilder.engineVolume;
        this.enginePower = carBuilder.enginePower;
        this.doorsCount = carBuilder.doorsCount;
        this.trunkVolume = carBuilder.trunkVolume;
        this.gearboxType = carBuilder.gearboxType;
    }


    static class SportCarBuilder implements CarBuilder {
        // TODO: Zadanie - zrób swój builder dla sportoweo samochodu! Stwórz go w mainie i sprawdź czy działa!
        // TIP: nie musicie działać całkowicie według schematu z Human.java, możecie zaszaleć :)
        private String engineType;
        private float engineVolume;
        private int enginePower;
        private int trunkVolume;
        private int doorsCount;
        private String gearboxType;

        @Override
        public CarBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        @Override
        public CarBuilder setEngineVolume(float engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        @Override
        public CarBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        @Override
        public CarBuilder setTrunkVolume(int trunkVolume) {
            this.trunkVolume = trunkVolume;
            return this;
        }

        @Override
        public CarBuilder setDoorsCount(int doorsCount) {
            this.doorsCount = doorsCount;
            return this;
        }

        @Override
        public CarBuilder setGearboxType(String gearboxType) {
            this.gearboxType = gearboxType;
            return this;
        }

        @Override
        public Car build() {
            return new SportCar(this);
        }
    }
}

package carRace;

import carRace.drivers.Driver;
import carRace.transport.Car;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    private static Map<Car, Set<Mechanic>> carMechanic = new HashMap<>();


    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Укажите модель";
        } else {
            this.model = model;
        }

        if (engineVolume < 0) {
            this.engineVolume = 0;
            System.out.println("Укажите объем двигателя");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    /**
     * геттеры и сеттеры
     **/
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    /**
     * методы
     **/
    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean service();

    public void addDrivers(Driver<?> ...drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?> ... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsors(Sponsor ...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void repair();

    @Override
    public String toString() {
        return brand + '\'' + model + '\'';
    }
}
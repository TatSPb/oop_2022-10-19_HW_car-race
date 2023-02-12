package carRace;

import carRace.drivers.Driver;
import carRace.transport.Car;

import java.util.*;

public abstract class Transport implements Comparable {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    //private final Set<Mechanic<?>> mechanics = new HashSet<>();

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
    public void addDrivers(Driver<?> ...drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    //public Set<Mechanic<?>> getMechanics() {return mechanics;}

    public void addMechanic(Mechanic<?> ... mechanics) { this.mechanics.addAll(Arrays.asList(mechanics));}
  // public void addMechanic(Mechanic<?> ... mechanics) { this.mechanics.addAll(Arrays.asList(mechanics));}



    @Override
    public String toString() {
        return brand + '\'' + model + '\'';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
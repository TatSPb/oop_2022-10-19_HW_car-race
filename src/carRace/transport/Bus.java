package carRace.transport;

import carRace.Transport;
import carRace.carParameters.TypeOfCapacity;

import java.util.Objects;

public class Bus extends Transport implements Comparable {
    private TypeOfCapacity typeOfCapacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineVolume);

        this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return typeOfCapacity == bus.typeOfCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfCapacity);
    }
}



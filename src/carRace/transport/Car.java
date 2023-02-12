package carRace.transport;

import carRace.Transport;
import carRace.carParameters.TypeOfBody;

import java.util.Objects;

public class Car extends Transport implements Comparable {

    private TypeOfBody typeOfBody;

    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);

        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return typeOfBody == car.typeOfBody;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfBody);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

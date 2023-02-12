package carRace.transport;

import carRace.Transport;
import carRace.carParameters.TypeOfWeight;

public class Truck extends Transport implements Comparable {

    private TypeOfWeight typeOfWeight;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 TypeOfWeight typeOfWeight) {
        super(brand, model, engineVolume);
        this.typeOfWeight = typeOfWeight;
    }

    public TypeOfWeight getTypeOfWeight() {
        return typeOfWeight;
    }

    public void setTypeOfWeight(TypeOfWeight typeOfWeight) {
        this.typeOfWeight = typeOfWeight;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

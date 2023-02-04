package carRace.transport;

import carRace.Competing;
import carRace.Transport;
import carRace.carParameters.TypeOfWeight;

public class Truck extends Transport implements Competing {

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
    public void start() {
        System.out.println("Успешный старт грузовика: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш грузовика: двигатель заглушен, ключ из замка зажигания извлечен");
    }
    @Override
    public void printType() {
        if (typeOfWeight ==null) {
            System.out.println("Данных по грузовику недостаточно");
        } else {
            String from = typeOfWeight.getFrom() == null ? "" : "от " + typeOfWeight.getFrom() + " ";
            String to = typeOfWeight.getTo() == null ? "" : "до " + typeOfWeight.getTo();
            System.out.println("Грузоподъёмность грузовика " + from + to + " тонн.");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик: произведена техническая остановка, залито топливо");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга у грузовика");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен" );
    }
}

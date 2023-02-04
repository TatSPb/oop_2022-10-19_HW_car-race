package carRace.transport;

import carRace.Competing;
import carRace.Transport;
import carRace.carParameters.TypeOfCapacity;

public class Bus extends Transport implements Competing {
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
    public void start() {
        System.out.println("Успешный старт автобуса: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш автобуса: двигатель заглушен, ключ из замка зажигания извлечен");
    }
    @Override
    public void printType() {
        if (typeOfCapacity ==null) {
            System.out.println("Данных по автобусу недостаточно");
        } else {
            System.out.println("Вместимость автобуса от " + typeOfCapacity.getFrom() + " до " + typeOfCapacity.getTo() + " мест.");
        }
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус: произведена техническая остановка, проверено техническое состояние");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга у автобуса");
    }

    @Override
    public boolean service() {

        System.out.println("Автобус " +getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен" );
    }
}



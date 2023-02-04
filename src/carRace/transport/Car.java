package carRace.transport;

import carRace.Competing;
import carRace.Transport;
import carRace.carParameters.TypeOfBody;

public class Car extends Transport implements Competing {

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
    public void start() {
        System.out.println("Успешный старт машины: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш машины: двигатель заглушен, ключ из замка зажигания извлечен");
    }

    @Override
    public void printType() {
        if (typeOfBody ==null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова автомобиля: " + typeOfBody + ".");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль: произведена техническая остановка, заменена шина");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшее время круга для автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга для автомобиля");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена" );
    }


}

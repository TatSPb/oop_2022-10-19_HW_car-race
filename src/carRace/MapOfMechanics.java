package carRace;

import carRace.carParameters.TypeOfBody;
import carRace.transport.Car;
import carRace.transport.Truck;

import java.util.*;


public class MapOfMechanics {
    public static void main(String[] args) {

        Mechanic<Car> bb = new Mechanic<>("Брайн", "Берч", "Компания1");
        Mechanic<Car> pp = new Mechanic<>("Петр", "Петров", "Компания2");
        Mechanic<Car> vv = new Mechanic<>("Владлен", "Волосов", "Компания3");
        Mechanic<Car> mm = new Mechanic<>("Марк", "Захаров", "Компания4");
        Mechanic<Truck> dd = new Mechanic<>("Дэвид", "Дин", "Бест Рейсинг");
        Mechanic<Transport> ww = new Mechanic<>("Вальтер", "Валлер", "Райсинг Рипеа");

        Car audiA8 = new Car("Audi", "A8", 3.0, TypeOfBody.COUPE);
        Car scodaFabia = new Car("Scoda", "Fabia", 1.6, carRace.carParameters.TypeOfBody.SEDAN);

        System.out.println("ВАРИАНТ 1 ");

        System.out.println("Список механиков Scoda Fabia: ");
        Map<Transport, Mechanic> mapOfCarMechanicsScoda = new HashMap<>();
        for (Mechanic<Car> carMechanic : Arrays.asList(vv, mm)) {
            scodaFabia.addMechanic(carMechanic);
            mapOfCarMechanicsScoda.put(scodaFabia, carMechanic);
            System.out.println(mapOfCarMechanicsScoda);
        }
        System.out.println("\nСписок механиков Audi A8: ");
        Map<Transport, Mechanic> mapOfCarMechanicsAudi = new HashMap<>();
        for (Mechanic<Car> carMechanic2 : Arrays.asList(bb, pp)) {
            audiA8.addMechanic(carMechanic2);
            mapOfCarMechanicsAudi.put(audiA8, carMechanic2);
            System.out.println(mapOfCarMechanicsAudi);
        }
        System.out.println("\nСписок механиков Audi A8 + Scoda Fabia: ");

        Map<Transport, Mechanic> mapOfCarMechanics3 = new HashMap<>();
        mapOfCarMechanics3.putAll(mapOfCarMechanicsAudi);
        mapOfCarMechanics3.putAll(mapOfCarMechanicsScoda);
        System.out.println(mapOfCarMechanics3);

        System.out.println("ВАРИАНТ 2 - не получается цикл\n ");
        audiA8.addMechanic(bb);
        audiA8.addMechanic(pp);
        scodaFabia.addMechanic(vv);
        scodaFabia.addMechanic(mm);

        Map<Transport, Mechanic> mapOfCarMechanicsVar2 = new HashMap<>();
        for (Mechanic<?> i : Arrays.asList(Mechanic<Car>)) {
         audiA8.getMechanics();
         scodaFabia.getMechanics();
         mapOfCarMechanicsVar2.put(audiA8, i);
         mapOfCarMechanicsVar2.put(scodaFabia, i);
        }
        System.out.println(mapOfCarMechanicsVar2);

       System.out.println("ВАРИАНТ 3 - задвоились механики" );
        for (String s : Arrays.asList(
                audiA8.getBrand() + " " + audiA8.getModel() + " " + audiA8.getMechanics(),
                scodaFabia.getBrand() + " " + scodaFabia. getModel() + " " + scodaFabia.getMechanics())) {
            System.out.println(s);
        }



        Set<Mechanic> setOfMechanics = new HashSet<>();
        setOfMechanics.add(bb);
        setOfMechanics.add(pp);
        setOfMechanics.add(vv);
        setOfMechanics.add(mm);
        // System.out.println("Множество механиков: " + setOfMechanics);

        Set<Transport> setOfTransport = new HashSet<>();
        setOfTransport.add(audiA8);
        setOfTransport.add(scodaFabia);
        //System.out.println("Множество а/м: " + setOfTransport);


        // System.out.println( "механик " + Transport.getMechanics() + Transport.);
    }


}


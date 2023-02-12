package carRace;

import carRace.carParameters.TypeOfBody;
import carRace.carParameters.TypeOfCapacity;
import carRace.carParameters.TypeOfWeight;
import carRace.transport.Bus;
import carRace.transport.Car;
import carRace.transport.Truck;

import java.util.*;


public class MapOfMechanics {
    public static void main(String[] args) {

        Mechanic<Car> bb = new Mechanic<>("Брайн", "Берч", "Компания1");
        Mechanic<Car> pp = new Mechanic<>("Петр", "Петров", "Компания2");
        Mechanic<Car> vv = new Mechanic<>("Владлен", "Волосов", "Компания3");
        Mechanic<Car> mm = new Mechanic<>("Марк", "Захаров", "Компания4");
        Mechanic<Truck> dd = new Mechanic<>("Дэвид", "Дин", "Компания5");
        Mechanic<Truck> ee = new Mechanic<>("Егор", "Егоров", "Компания6");
        Mechanic<Bus> ww = new Mechanic<>("Вальтер", "Валлер", "Компания7");
        Mechanic<Bus> ss = new Mechanic<>("Стас", "Стасов", "Компания8");

        Car audiA8 = new Car("Audi", "A8", 3.0, TypeOfBody.COUPE);
        Car scodaFabia = new Car("Scoda", "Fabia", 1.6, carRace.carParameters.TypeOfBody.SEDAN);
        Truck kamaz5460 = new Truck("Kamaz", "5460", 12.0, TypeOfWeight.N2);
        Bus hyundaiA201 = new Bus("Hyundai", "A201", 13.00, TypeOfCapacity.LARGE);

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

        System.out.println("ВАРИАНТ 2 - не получается цикл по добавлению в МАПу\n ");
        audiA8.addMechanic(bb);
        audiA8.addMechanic(pp);
        scodaFabia.addMechanic(vv);
        scodaFabia.addMechanic(mm);
        kamaz5460.addMechanic(dd);
        kamaz5460.addMechanic(ee);
        hyundaiA201.addMechanic(ww);
        hyundaiA201.addMechanic(ss);

        Map<Transport, Mechanic> mapOfCarMechanicsVar2 = new HashMap<>();
        for (Mechanic<?> i : Arrays.asList(Mechanic<Car>)) {
         audiA8.getMechanics();
         scodaFabia.getMechanics();
         mapOfCarMechanicsVar2.put(audiA8, i);
         mapOfCarMechanicsVar2.put(scodaFabia, i);
        }
        System.out.println(mapOfCarMechanicsVar2);



        System.out.println("\nВАРИАНТ 3.1 - список есть, но без Мапа. Как положить его в Map? ");
        Map<Transport, Mechanic> mapOfCarMechanicsVar33 = new HashMap<>();
        for (var s : Arrays.asList(
                audiA8.getBrand() + " " + audiA8.getModel() + " " + audiA8.getMechanics(),
                scodaFabia.getBrand() + " " + scodaFabia.getModel() + " " + scodaFabia.getMechanics(),
                hyundaiA201.getBrand() + " " + hyundaiA201.getModel() + " " + hyundaiA201.getMechanics(),
                kamaz5460.getBrand() + " " + kamaz5460.getModel() + " " + kamaz5460.getMechanics()
        )) {
            System.out.println(s);

            System.out.println("\nВАРИАНТ 3.2 ");
            Map<Transport, Mechanic> mapOfCarMechanicsVar34 = new HashMap<>();
            for (var у : Transport) {
                audiA8.addMechanic(pp);
                scodaFabia.addMechanic(vv);
                mapOfCarMechanicsVar33.put (audiA8, audiA8.getMechanics());
                mapOfCarMechanicsVar33.put (scodaFabia, scodaFabia.getMechanics());
            }

                System.out.println(mapOfCarMechanicsVar34);


            for (Map.Entry<Transport, Mechanic> entry : mapOfCarMechanicsVar33.entrySet()) {
                if (!mapOfCarMechanicsVar33.isEmpty()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                } else
                    System.out.println("Мапа пустая");
            }
        }

        for (Map.Entry<Transport, Mechanic> entry : mapOfCarMechanicsVar33.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nВАРИАНТ 4 ");
        Map<Transport, Mechanic> mapOfCarMechanicsVar44 = new HashMap<>();
        mapOfCarMechanicsVar44.put (audiA8, bb);
        mapOfCarMechanicsVar44.put (audiA8, bb);
        mapOfCarMechanicsVar44.put (kamaz5460, dd);
        mapOfCarMechanicsVar44.put (hyundaiA201, ww);
        System.out.println(mapOfCarMechanicsVar44);

        for(Map.Entry<Transport, Mechanic> item : mapOfCarMechanicsVar44.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName() + ' ' + item.getValue().getSurname());
        }


    }
}


package carRace;

import carRace.carParameters.TypeOfBody;
import carRace.carParameters.TypeOfCapacity;
import carRace.carParameters.TypeOfWeight;
import carRace.drivers.DriverB;
import carRace.drivers.DriverC;
import carRace.drivers.DriverD;
import carRace.transport.Bus;
import carRace.transport.Car;
import carRace.transport.Truck;

import java.util.*;


public class MapOfMechanics {
    public static void main(String[] args) {

        Mechanic<Car> bb = new Mechanic<>("Брайн", "Берч", "Компания1");
        Mechanic<Car> pp = new Mechanic<>("Петр", "Петров", "Компания2");
        Mechanic<Car> vv = new Mechanic<>("Владлен", "Волосов", "Компания3");
        Mechanic<Car> mm = new Mechanic<>("Марк", "Маркович", "Компания4");
        Mechanic<Truck> dd = new Mechanic<>("Дэвид", "Дин", "Компания5");
        Mechanic<Truck> ee = new Mechanic<>("Егор", "Егоров", "Компания6");
        Mechanic<Truck> ff = new Mechanic<>("Федор", "Федоров", "Компания7");
        Mechanic<Bus> ww = new Mechanic<>("Вальтер", "Валлер", "Компания8");
        Mechanic<Bus> ss = new Mechanic<>("Стас", "Стасов", "Компания9");

        Car audiA8 = new Car("Audi", "A8", 3.0, TypeOfBody.COUPE);
        Car scodaFabia = new Car("Scoda", "Fabia", 1.6, carRace.carParameters.TypeOfBody.SEDAN);
        Truck volvoFh16 = new Truck("Volvo", "FH16", 16.0, TypeOfWeight.N1);
        Truck kamaz5460 = new Truck("Kamaz", "5460", 12.0, TypeOfWeight.N2);
        Bus nefaz5299 = new carRace.transport.Bus("Nefaz", "5299", 11.80, carRace.carParameters.TypeOfCapacity.MEDIUM);
        Bus hyundaiA201 = new Bus("Hyundai", "A201", 13.00, TypeOfCapacity.LARGE);

        DriverB inp = new DriverB("Иванов Николай Петрович", 'B', 5, audiA8);
        DriverC kiv = new DriverC("Коломенский Илья Васильевич", 'C', 8, kamaz5460);
        DriverD niv = new DriverD("Насонов Игорь Валерьевич", 'D', 10, hyundaiA201);

        audiA8.addDrivers(inp);
        kamaz5460.addDrivers(kiv);
        hyundaiA201.addDrivers(niv);

        for (Mechanic<Car> carM : Arrays.asList(bb, pp)) {
            audiA8.addMechanic(carM);
        }
        for (Mechanic<Car> carM : Arrays.asList(vv, mm)) {
            scodaFabia.addMechanic(carM);
        }
        for (Mechanic<Truck> truckM : Arrays.asList(dd, ee)) {
            kamaz5460.addMechanic(truckM);
        }

        for (Mechanic<Truck> truckM : Arrays.asList(dd, ff)) {
            volvoFh16.addMechanic(truckM);
        }

        for (Mechanic<Bus> busM : Arrays.asList(ww, ss)) {
            hyundaiA201.addMechanic(busM);
        }

        List<Transport> racers = new ArrayList<>();

//        racers.add(car);
//        racers.add(bus);
//        racers.add(truck);

        //не работает предложенный код - просто car/Car не положить, только конкретные объекты
        racers.add(audiA8);
        racers.add(scodaFabia);
        racers.add(kamaz5460);
        racers.add(volvoFh16);
        racers.add(hyundaiA201);

        Map<Transport, Mechanic> transportMechanicMap = new HashMap<>();

        for (Transport racer : racers) {
            for (Mechanic mechanic : racer.getMechanics()) {
                transportMechanicMap.put(racer, mechanic);
            }
        }

        System.out.println(transportMechanicMap);
        for (Map.Entry<Transport, Mechanic> item : transportMechanicMap.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName() + ' ' + item.getValue().getSurname());
        }
    }
}




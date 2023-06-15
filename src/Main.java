interface Transport {
    void perev();
}
class Truck implements Transport {
    public void perev() {
        System.out.println("Грузовик доставляет груз по дороге.");
    }
}
class ship implements Transport {
    public void perev() {
        System.out.println("Судно доставляет груз по морю.");
    }
}
class Airplane implements Transport {
    public void perev() {
        System.out.println("Самолет доставляет груз по воздуху.");
    }
}
class Fabric {
    public static Transport createTransport(String type) {
        if (type == "по дороге") {
            return new Truck();
        } else if (type == "по морю") {
            return new ship();
        } else if (type == "по воздуху") {
            return new Airplane();
        } else {
            throw new RuntimeException("Неизвестный тип перевозок");
        }
    }
}
    public class Main {
        public static void main(String[] args) {
            Transport truck = Fabric.createTransport("по дороге");
            truck.perev();

            Transport ship = Fabric.createTransport("по морю");
            ship.perev();

            Transport airplane = Fabric.createTransport("по воздуху");
            airplane.perev();
        }
    }



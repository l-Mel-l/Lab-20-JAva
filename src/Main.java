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
        if (type == "грузовик") {
            return new Truck();
        } else if (type == "судно") {
            return new ship();
        } else if (type == "самолёт") {
            return new Airplane();
        } else {
            return null;
        }
    }
}
    public class Main {
        public static void main(String[] args) {
            Transport truck = Fabric.createTransport("грузовик");
            truck.perev();

            Transport ship = Fabric.createTransport("судно");
            ship.perev();

            Transport airplane = Fabric.createTransport("самолёт");
            airplane.perev();
        }
    }



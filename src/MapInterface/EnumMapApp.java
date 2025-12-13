package MapInterface;

import java.util.EnumMap;

public class EnumMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, "Gratis");
        map.put(Level.PREMIUM, "Bayar");

        System.out.println(map.get(Level.FREE));
        System.out.println(map.get(Level.PREMIUM));
    }
}

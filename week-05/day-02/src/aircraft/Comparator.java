package aircraft;

public class Comparator {
    public static java.util.Comparator<Aircraft> aircraftComparator
            = (aircraft1, aircraft2) -> {
        int priority1 = aircraft1.isPriority() ? 1 : 0;
        int priority2 = aircraft2.isPriority() ? 1 : 0;

        return priority2 - priority1;
    };
}

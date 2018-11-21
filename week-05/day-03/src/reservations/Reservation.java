package reservations;

public class Reservation implements Reservationy {
    private String code;
    private String dow;

    public Reservation() {
        this.code = getRandomCode();
        this.dow = getRandomDow();
        System.out.println("Booking# " + this.code + " for " + this.dow);
    }

    @Override
    public String getDowBooking() {
        return this.dow;
    }

    @Override
    public String getCodeBooking() {
        return this.code;
    }

    public String getRandomDow() {
        String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int random = (int)(Math.random() * 7);
        return dow[random];
    }

    public String getRandomCode() {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        for (int i = 0; i < 8; i++) {
            int random = (int)(Math.random() * 35);
            code = code + abc.substring(random, random + 1);
        }
        return code;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "code='" + code + '\'' +
                ", dow='" + dow + '\'' +
                '}';
    }
}

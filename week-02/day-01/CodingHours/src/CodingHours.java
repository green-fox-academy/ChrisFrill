public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        double coding = 17 * 5 * 6;
        System.out.println(coding);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double avgWorkingHours = 52 * 17;
        System.out.println(coding  / avgWorkingHours * 100 + "%");

    }
}

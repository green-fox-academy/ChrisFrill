public class ToDoPrint {
    public static void main(String... args) {
        StringBuilder todoText = new StringBuilder(" - Buy milk\n");
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        todoText.insert(0, "My todo:\n")
                .insert(todoText.length(), " - Download games\n")
                .insert(todoText.length(), "\t - Diablo");

        System.out.println(todoText);
    }
}
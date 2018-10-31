public class BMI {
        public static void main(String[] args) {
            double massInKg = 81.2;
            double heightInM = 1.78;

            // Print the Body mass index (BMI) based on these values
            // BMI = weight (kg) ÷ height2
            System.out.println(massInKg / (heightInM * heightInM));
        }

}

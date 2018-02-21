public class Randomizer {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int myNumber = randomize(10,4);
            System.out.println(myNumber);

        }
        public static randomize(int max, int min) {

        for (int i = 0; i < 10; i++) {
            int range = max - min +1;
            int randomNum = r.nextInt(range) + min;
            return randomNum;

        }
    }
}
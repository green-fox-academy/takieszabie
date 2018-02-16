public class exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInMins = 60;
        int minsInHours = 60;

        int passedSeconds = ((currentHours * minsInHours * secondsInMins) + (currentMinutes * secondsInMins) + currentSeconds);
        int totalSeconds = 24 * 60 * 60;

        int remaining = (totalSeconds - passedSeconds);

        System.out.println(remaining);
    }
}

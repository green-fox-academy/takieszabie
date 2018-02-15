public class excercise6 {
    public static void main (String [] args){
        int WeeklyWorkHours = 52;
        int noOfCourseWeeks = 17;
        int dailyCodingHours = 6;
        int noOfWeekDays = 5;

        float codingHours = noOfCourseWeeks * dailyCodingHours * noOfWeekDays;
        float workHours = WeeklyWorkHours * noOfCourseWeeks;
        float percentage = codingHours / workHours;

        System.out.println("Hours spent, if coding on workdays:");
        System.out.println(codingHours);

        System.out.println("Percentage of coding hours:");
        System.out.println(percentage * 100 + "%") ;
    }
}

import com.sun.org.apache.xpath.internal.SourceTree;

public class exercise9 {
    public static void main(String[] args){
        double massInKg =81.2;
        double heightInM = 1.78;

        double negyzet = (heightInM * heightInM);
        double index = (massInKg / negyzet);

        System.out.println("Body-mass index is:");
        System.out.println(index);
    }
}

import java.util.Scanner;

class Distance{
    private int feet, inch;
    public Distance(int f, int i){
        feet = f;
        inch = i;
    }

    void displayDistance(){
        System.out.println("Distance: " + feet + " feets " + inch + " inches ");
    }

    static Distance addDistance(Distance d1, Distance d2){
        int totalFeet = d1.feet + d2.feet + (d1.inch + d2.inch) / 12;
        int totalInch = (d1.inch + d2.inch) % 12;
        return new Distance(totalFeet, totalInch);
    }
}

public class myDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Distance[] d = new Distance[2];
        for(int i = 0; i < 2; i++){
            System.out.print("Enter Distance"+i+" (feet inch): ");
            int feet = sc.nextInt();
            int inch = sc.nextInt();
            d[i] = new Distance(feet, inch);
        }
        d[0].displayDistance();
        d[1].displayDistance();
        Distance result = Distance.addDistance(d[0], d[1]);
        result.displayDistance();
        sc.close();
    }
}

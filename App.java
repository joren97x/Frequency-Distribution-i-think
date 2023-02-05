import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double classs = 5;
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        double[] arr = new double[size];


        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);

        System.out.println(getRange(arr[arr.length-1], arr[0]));
        double range = getRange(arr[arr.length-1], arr[0]);
        System.out.println(divideItByClass(classs, range));
        double addToEachNum = divideItByClass(classs, range);

        sc.close();

    }


    public static double getRange(double highestNum, double lowestNum) {
        double range = highestNum - lowestNum;
        return range;
    }

    public static double divideItByClass(double classs, double range) {

        double ans = range / classs;
        ans = Math.ceil(ans);
        return ans;

    }

    
    

}

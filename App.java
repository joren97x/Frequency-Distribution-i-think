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

        System.out.println("1. " + getRange(arr[arr.length-1], arr[0]));
        double range = getRange(arr[arr.length-1], arr[0]);
        System.out.println("2. " + divideItByClass(classs, range));
        double addToEachNum = divideItByClass(classs, range);

        double[] numOfClasses = addNumToLowestNum(arr[0], addToEachNum, classs);

        System.out.println("3. " + Arrays.toString(numOfClasses));


        sc.close();

    }

    public static double[] addNumToLowestNum(double lowestNumFromArr, double numberToAdd, double classs) {

        double[] output = new double[(int) classs];
        double tempNum = lowestNumFromArr;
        
        for(int i = 0; i < classs; i++) {

            output[i] = tempNum + numberToAdd;
            tempNum = output[i];


        }

        return output;

    }

    // public static double[] addNums(double lowestNumFromArr, double numberToAdd, int classs) {

        
    //     for(int i = 0; i < classs; i++) {

    //         tempNum = 

    //     }

    // }

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

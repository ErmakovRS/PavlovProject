import java.util.ArrayList;
import java.util.Scanner;

public class SecondTask {
    Scanner scan = new Scanner(System.in);
    public boolean scanNum() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;

        }
        else {
            return false;
        }
    }
    public void consNum() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if ( num >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    public boolean numTask() {
        int num = scan.nextInt();
        if (num >= 10 && num <= 20) {
            return true;

        }
        else {
            return false;
        }

    }
    public String scanTask() {
        String word = scan.nextLine();
        int times = scan.nextInt();
        String result = "";
        for (int i = 0; i < times; i++ ) {
            result += word  + "\n";
        }
        System.out.println(result);
        return result;


    }
   public boolean isLeapYear (int year) {
        return (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public void arraySort() {
        int a[] = {0,1,1,0,0,1};
        for(int i=0; i < a.length; i++)
            if (a[i]==0)
                a[i] = 1;
            else
                a[i] = 0;
    }
    public void fullArray() {
        int[] array = new int[100];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i++];
            System.out.println(array[i]);
        }
    }

    public void arrayNum() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }

    }
    public void massive() {
        int n = 4;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - i - 1] = 1;
        }
    }
    

}

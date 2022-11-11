import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tasKx2Massive {
    public static void main (String[] args){
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int massive[][] = new int[n][n];

        System.out.println("Введите числа в массив");
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                massive[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i=0;i<massive.length;i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.print("\n");
        }
        int index = 0;
        int min = massive[0][0];
        ArrayList<Integer>massive2= new ArrayList<Integer>();
        for (int i=0;i<massive.length;i++){
            min=massive[i][0];
            for (int j=0;j<massive.length;j++){
                if (massive[i][j]<min){
                    min = massive[i][j];
                }

            }
            massive2.add(min);

        }
        System.out.println(massive2);
        System.out.println(Collections.max(massive2));



    }

}

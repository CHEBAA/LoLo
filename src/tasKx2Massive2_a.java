import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tasKx2Massive2_a {
    public static void main (String[] args){
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int massive[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                massive[i][j] = (int) (Math.random()*100);
            }
        }
        for (int i=0;i<massive.length;i++){
            for (int j =0; j<massive.length;j++){
                System.out.print(massive[i][j] +" ");
            }
            System.out.println("\n");
        }
        ArrayList<Integer> massive2= new ArrayList<Integer>();

        int maxElem = 0;
        int Num = massive[0][0];
        int massive3[] = new int[n];
        Arrays.fill(massive3,0);
        for (int i=0;i<massive.length;i++){
            for (int j=0; j<massive.length;j++){
                if (massive[i][j]%2==0){
                    massive2.add(massive[i][j]);
                }
            }
            massive3[i] = Collections.max(massive2);
            massive2.clear();
        }
        for (int i=0;i<n;i++){
            System.out.print(massive3[i] +" ");
        }

    }
}



import java.util.Scanner;

public class zad {
    public static void main (String[] args){
        System.out.println("Введите ддину массива");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int massive[] = new int[n];
        System.out.println("Введите числа в массив");
        for (int i=0;i<n;i++){
            massive[i] = Integer.parseInt(in.nextLine());
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if (i%2 == 0 && massive[i]%2 !=0){
                count++;
            }
        }
        System.out.println("количество нечетных чисел на четных местах " +count);
        in.close();
    }
}

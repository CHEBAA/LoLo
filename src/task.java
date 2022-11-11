import java.util.Scanner;

public class task {
    public static void main (String[] args) {
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int massive[] = new int[n];

        System.out.println("Введите числа в массив");
        for(int i=0;i<n;i++){
            massive[i] = Integer.parseInt(in.nextLine());
        }
        for (int i=0;i< massive.length;i++){
            System.out.print(massive[i]+" ");
        }
        int max = massive[0];
        int min = massive[0];
        int indexMin = 0;
        int indexMax = 0;
        for(int i=0;i<n;i++){
            if (massive[i]>max){
                max = massive[i];
            indexMax = i;
            }
            if (massive[i]<min) {
                min = massive[i];
                indexMin = i;
            }
        }
        if (indexMax>indexMin){
            for (int i=indexMin, j = indexMax; i<j;i++, j-- ){
                n = massive[i];
                massive[i]=massive[j];
                massive[j]= n;
            }
        }else {
            for(int i=indexMin, j = indexMax; i>j; i--,j++){
                n=massive[i];
                massive[i]=massive[j];
                massive[j] = n;
            }

        }

        for(int i=0;i<n;i++)
            for(int j = 0;j>n;j++)

        System.out.print("\n");
        for (int i=0;i< massive.length;i++){
            System.out.print(massive[i]+" ");
        }
        System.out.print("\n");
        System.out.println(max);
        System.out.println(min);
        System.out.println(indexMax);
        System.out.println(indexMin);
        ;

    }

}

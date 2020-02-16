import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("hang");
        int hang = input.nextInt();

        System.out.println("cot");
        int cot= input.nextInt();

        int [][] arr = new int [hang][cot];

        for (int i = 0 ; i < hang; i++){
            for (int j = 0 ; j < cot ; j++){
                System.out.println("arr[" + i +"][" + j + "]");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Ban muon tinh tong cot bao nhieu: \n");
        int col = input.nextInt();
        int total = 0;
        for (int i = 0; i < hang ; i++){
            for (int j = 0 ; j <cot; j++){
                if (j== col)
                    total = total + arr[i][j];
            }
        }
        System.out.println("Tong cua cot " +col +"la:" + total);



    }
}

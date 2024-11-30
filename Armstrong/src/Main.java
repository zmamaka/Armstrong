import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbr, tempNumber, basNumber = 0, x, total = 0, poweredX = 1;

        System.out.print("Sayı giriniz => ");
        nbr = scan.nextInt();

        tempNumber = nbr;
        while (tempNumber != 0){

            tempNumber /= 10;
            basNumber++;

        }

        tempNumber = nbr;
        while (tempNumber != 0){

            x = tempNumber % 10;

            for (int i = 1; i <= basNumber; i++){

                poweredX *= x;

            }

            total += poweredX;
            poweredX = 1;
            tempNumber /= 10;

        }

        System.out.println(total);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scan.nextInt();
         int[] number = new int[size];



        System.out.println("initialise the array with size "+ size);
        for (int i = 0; i < size; i++) {

           number[i]= scan.nextInt();
        }
        System.out.println("Enter the num you want to search :");
        int search = scan.nextInt();
        boolean found = false;

        for (int i = 0; i < (number.length); i++) {
            if(number[i]== search ){
                System.out.println("Index of number "+search+" is "+ i);
                found = true;
                break;
            }



        }
        if (!found) {
            System.out.println("Number not found.");
        }




    }
}
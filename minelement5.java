
import java.util.*;
public class minelement5 {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int min = 0;

            for(int i = 0; i < arr.length ; i++){

                System.out.print("Enter " + (i + 1) + " element : ");
                arr[i] = sc.nextInt();
            }

            min = arr[0];
           
            for(int i = 0; i < arr.length; i++){

                    if(min > arr[i]){

                        min = arr[i];

                    }

            }
            System.out.println( "Min element in array : " + min);
   } 
    
}
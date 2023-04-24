import java.util.Scanner;

public class searchelementIndex4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int size = sc.nextInt();

    int arr[] = new int[size];

        for(int i = 0;i < arr.length; i++){

            System.out.print("Element " +(i +1) +  " : ");
            arr[i] = sc.nextInt();
        
        }

        System.out.print("Enter element to search : ");
        int searchelement = sc.nextInt();

        for(int i = 0; i< arr.length; i++){

            if(searchelement == arr[i]){

                System.out.println("Element found at index : " + i);
            }else{
               
            }

        }
 }   
}



import java.io.*;

public class evendigitsumofarray10 {
   public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of array : ");
            int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];


                for(int i = 0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element : ");
                    arr[i] = Integer.parseInt(br.readLine());  
                }

                System.out.print("Elements with sum of digit is even : ");
                int count = 0;

                for(int i = 0; i < arr.length; i++){

                        
                    int num = arr[i];
                    int sum = 0;
                    

                    while(num != 0){

                        int rem = num % 10;
                        sum += rem;
                        num /= 10;
                    }

                    if(sum % 2 == 0){

                        System.out.print(arr[i]  + " ");
                        count++;
                        
                    }

                }
                System.out.println();
                System.out.println("Total elements are : " + count);


    } 
}

import java.io.*;

public class oddEvensum3 {

   public static void main(String[] args) throws IOException{

                
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of the array : ");
            int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                int oddSum = 0, evenSum = 0;

                for(int i = 0; i < arr.length; i++){

                    
                        System.out.print("Enter " + (i + 1) + " element : ");

                        arr[i] = Integer.parseInt(br.readLine());

                        if(arr[i] % 2 == 0){

                            evenSum += arr[i];

                        }else{

                            oddSum += arr[i];
                        }
                        
                }
                
            System.out.println("Odd Sum : " + oddSum);
            System.out.println("Even Sum : " + evenSum);
   } 
    
}

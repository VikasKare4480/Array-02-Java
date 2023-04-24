import java.io.*;

public class oddEvenCount2 {

   public static void main(String[] args) throws IOException{

                
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of the array : ");
            int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size];

                int oddCount = 0, evenCount = 0;

                for(int i = 0; i < arr.length; i++){

                    
                        System.out.print("Enter " + (i + 1) + " element : ");

                        arr[i] = Integer.parseInt(br.readLine());

                        if(arr[i] % 2 == 0){

                            evenCount++;

                        }else{

                            oddCount++;
                        }
                        
                }
            System.out.println("Odd Count : " + oddCount);
            System.out.println("Even Count : " + evenCount);
   } 
    
}

import java.io.*;



public class uncommonelement8 {

   public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of array 1 : ");
            int size1 = Integer.parseInt(br.readLine());

                int arr1[] = new int[size1];

                for(int i = 0; i < arr1.length; i++){

                System.out.print("Enter " + (i + 1) + " element : ");
                    arr1[i] = Integer.parseInt(br.readLine());

                }

            System.out.print("Enter size of array 2 : ");
            int size2 = Integer.parseInt(br.readLine());

                int arr2[] = new int[size2];

                for(int i = 0; i < arr2.length; i++){

                        System.out.print("Enter " + (i + 1) + " element : ");
                        arr2[i] = Integer.parseInt(br.readLine());

                }  
                
        // uncommon elemtnts are 

        System.out.print("Uncommon elements are : ");

        // for array 1 

        for(int i = 0; i < arr1.length; i++){

            int count = 0; 
 
            // int commonin2 = 0;

                for(int j =0; j < arr2.length; j++){

                    

                    if(arr1[i] == arr2[j]){

                        count++;

                    }
                }
                if(count == 0){

                    System.out.print(arr1[i] + " ");

                }
        }

        // for array 2

        for(int i = 0; i < arr2.length; i++){

                int count = 0;
            for(int j = 0; j < arr1.length; j++){

                    if(arr2[i] == arr1[j]){

                        count++;

                    }
            }
            if(count == 0){

                System.out.print(arr2[i] + " ");

            }

        }
        
        System.out.println();

   } 
    
}

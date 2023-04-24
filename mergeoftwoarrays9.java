import java.io.*;

public class mergeoftwoarrays9 {

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
                        
                // declaring array3 for adding two arrays 

                int arr3[] = new int[size1 + size2];

                // copy array 1 elements 

                for(int i = 0; i < arr1.length; i++){

                        arr3[i] = arr1[i];
                    
                }
                
                // copy  array 2 elements 

                

                for(int i = 0 ; i < arr2.length; i++){

                    
                    arr3[arr1.length + i] = arr2[i]; 

                }


                // printing array 3 
                for(int i = 0; i < arr3.length; i++){

                    System.out.println(arr3[i] + " ");

                }
   } 
    
}
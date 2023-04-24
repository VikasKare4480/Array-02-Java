import java.io.*;

public class commonoftows7 {

            public static void main(String[] args)throws IOException {

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
                    
                
                // finding the common of the two arrays : 

               int common[] = new int[size1 + size2];

                int count = 0;
                System.out.println("Common elements are ");



                for(int i = 0; i < arr1.length; i++){

                            for(int j = 0; j < arr2.length; j++){

                                if(arr1[i] == arr2[j]){

                                    System.out.print( arr1[i] + " ");
                                    common[i] = arr1[i];
                                    count++;

                                }

                            }
                }

                if(count == 0){

                    System.out.println("No common element's found ");

                }else{

                    // System.out.print("Common Elements are : ");
                    
                    // for(int i = 0; i < common.length; i++){

                    //     System.out.print(common[i] + " ");

                    // }
                }
                System.out.println();
            }
}

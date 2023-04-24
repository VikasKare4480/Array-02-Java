import java.io.*;

public class maxelement6 {

        public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter size of the array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                int max = arr[0];

                    for(int i = 0; i < arr.length; i++){

                        System.out.print("Enter " + (i + 1) + " element : ");
                        arr[i] = Integer.parseInt(br.readLine());
                        if(max < arr[i]){

                            max  = arr[i];

                        }
                    }
                System.out.println("Max element of array : " + max );
        }


}

    


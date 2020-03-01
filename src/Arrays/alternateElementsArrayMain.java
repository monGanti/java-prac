package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class alternateElementsArrayMain {
    int arr[] = null;

    //Time Complexity = O(n)
    public void alternateValues(){
        for(int i=0;i<arr.length;i=i+2){
            System.out.print(arr[i] + " ");
        }
    }

    //Time Complexity = O(1)
    public void arraySize(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the ArraySize");
            String s = br.readLine();
            int sizeOfArray = Integer.parseInt(s);
            System.out.println("You have enterred" +sizeOfArray);
            arr = new int[sizeOfArray];
        } catch (Exception e)
        {
            System.out.println("exception is" +e.getMessage());
        }
    }

    //Time Complexity = O(n)
    public void takeArrayInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the ArrayValues");
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
        } catch (Exception e)
        {
            System.out.println("exception is" +e.getMessage());
        }

    }


    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static void main(String args[]){
        alternateElementsArrayMain A = new alternateElementsArrayMain();
        A.arraySize();
        A.takeArrayInput();
        A.alternateValues();
    }
}

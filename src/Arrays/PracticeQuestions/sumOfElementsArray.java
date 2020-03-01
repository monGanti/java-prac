package Arrays.PracticeQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Question: Do the sum of all elements in the array and print it.
//Note: Input of the Array is taken in two ways:
// Type1 - from user
// Type2 - static values
public class sumOfElementsArray {

    //Type1: this will execute by taking input from user
    private void sumOfElements2(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = 0;
        int arr[]= null;
        try{
            System.out.println("Enter the Array Size");
            String s = br.readLine();
            int arrSize= Integer.parseInt(s);
            arr = new int[arrSize];
            System.out.println("Enter the total elements in array with space");
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for(int i =0; i<arrSize;i++){
                arr[i] = Integer.parseInt(strs[i]);
                temp = arr[i] + temp;
            }
            if (arr.length != arrSize){
                System.out.println("the total inputs did not match with the expected array Size.");
                return;
            }
            System.out.println("The Sum of these elements is" + temp);

        }catch (Exception e){
            System.out.println("exception is" +e.getMessage());
        }
    }

    //Type2: This will execute with static array
    private void sumOfElements1(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp = temp + arr[i];
        }
        System.out.println("The Sum of the elements with Static array is "+temp);
    }

    public static void main (String args[]){
        int arrType1[] = {3,2,1};
        sumOfElementsArray obj = new sumOfElementsArray();
        //Type1 array
        obj.sumOfElements2();

        //Type2 array
        obj.sumOfElements1(arrType1);

    }
}

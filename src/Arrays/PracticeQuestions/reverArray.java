package Arrays.PracticeQuestions;

//Question: Reverse an array of Integers

public class reverArray {
    int arr[] = {1,2,3,4};

    //this function traverses through the array in reverse order
    private void reverseArray(){
        for (int i=(arr.length-1); i>=0;i-- ){
           System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        reverArray obj = new reverArray();
        obj.reverseArray();
    }
}

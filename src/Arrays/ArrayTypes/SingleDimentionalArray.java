package Arrays.ArrayTypes;

public class SingleDimentionalArray {

    int arr[] = null;

    //Constructor
    public SingleDimentionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Print the array
    public void traverseArray(){
        try{
            for (int i=0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e){
            System.out.println("No Such Array Found");
        }
    }

    //Assinging a Cell Value's
    public void cellValuesAssignment(int value, int location){
        try{
                if (location >= arr.length){
                    System.out.println("Beyound the scope of this array, please stay within 10");
                }
                else if (arr[location] == Integer.MIN_VALUE){
                    arr[location] = value;
                } else {
                    System.out.println("we do not want to overwrite existing values");
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("out of scope");
            }
        }

    //Searching for a given Value and return the index
    public void searchValue(int value){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == value){
                System.out.println("the array index is" +i);
                return;
            }
        }
        System.out.println("Value Not Found");
    }

    //Deleting the array Values
    public void deletingValues(int index){
        if (index < arr.length){
            arr[index] = Integer.MIN_VALUE;
        }else
            System.out.println("index is not within the arrnage of array");
    }

}

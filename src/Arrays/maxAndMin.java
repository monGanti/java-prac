package Arrays;

public class maxAndMin {
    int arr[] = {1,345,234,21,56789};
    int maxTemp = 0;
    int minTemp = 0;

    public void maxValue(){
        for(int i =0;i<arr.length;i++){
            if (arr[i]> maxTemp){
                    maxTemp = arr[i];
            } else {
                maxTemp = maxTemp*1;
            }
        }
        System.out.println("MaxValue is" + maxTemp);
    }

    public void minValue(){
        for(int i =0;i<arr.length;i++){
            if (arr[i]< minTemp){
                minTemp = arr[i];
            } else {
                minTemp = minTemp*1;
            }
        }
        System.out.println("MinValue is" + minTemp);
    }

    public static void main(String args[]){

        maxAndMin ob = new maxAndMin();
        ob.maxValue();
        ob.minValue();

    }
}

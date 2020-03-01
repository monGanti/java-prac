package Arrays;

public class buyingSellingStock {
    int arr[] = {100,180,260,310,40,535,695};


    //Start from 0 and check if the trend is going UP or Down
    //If going UP then monitor it until the next fall and capture the dayIndex just before the fall ~ this is SellDay
    //If trend is going DOWN then monitor it until the next raise and capture the dayIndex just before the raise ~ this is BuyDay
    //Use the same recursion function with new start of BuyDay

    public int trendCheck(int location){
        int buyDay = 0;
        try {
                //Checking Going UP trend
                if (arr[location] < arr[location+1]){
                    System.out.println("Bought stock at " + (location+1) + "day");
                    for (int i = location+1; i < arr.length;i++){
                        if (arr[i] > arr[i+1]){
                            System.out.println("Time to Sell at " +(i+1)+"day");
                            buyDay = i+1;
                            break;
                        } else {
                            //do nothing
                        }
                    }
                    //Checking going DOWN trend
                } else {
                    for (int i = location+1;i<arr.length;i++){
                        if (arr[i]< arr[i+1]){
                            System.out.println("Bought stock at " +(i+1) + "day");
                            buyDay = i;
                            break;
                        }else {
                            //do nothing here
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("printing" + e.getMessage());
            }
        return buyDay;
    }

    //Execution
    public static void main (String args[]){
        int nextBuyDay = 0;
        buyingSellingStock obj = new buyingSellingStock();
        nextBuyDay = obj.trendCheck(0);
        nextBuyDay = obj.trendCheck(nextBuyDay);

    }
}

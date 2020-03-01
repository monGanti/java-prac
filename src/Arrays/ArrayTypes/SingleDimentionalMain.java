package Arrays.ArrayTypes;

public class SingleDimentionalMain {

    public static void main(String[] args) {

        System.out.println("Creating an empty array");
        SingleDimentionalArray sda = new SingleDimentionalArray(4);
        //sda.traverseArray();
        sda.cellValuesAssignment(10,0);
        sda.cellValuesAssignment(20,1);
        sda.cellValuesAssignment(30,2);
        sda.cellValuesAssignment(40,3);
        sda.cellValuesAssignment(40,4); // beyound the array lengh
        sda.cellValuesAssignment(70,3); // repeat a value on an already assigned cell location
        sda.traverseArray();
        sda.searchValue(30);
        sda.deletingValues(1);
        sda.deletingValues(5); // beyond the array length
        sda.traverseArray();
    }
}

package DZ7.GenericTasks;

public class SecondTast {

    public static <T> void printArray(T[] arrays){
        for(T array : arrays){
            System.out.println(array);
        }
    }

    public static void main(String[] args) {


        Integer[] array1 = {1,2,3,4,5};
        String[] array2 = {"one","two","three"};


        printArray(array1);
        printArray(array2);
    }
}

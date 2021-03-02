import java.util.Scanner;
public class concatenate {
    static void Concatenate(int[] arr1, int[] arr2){
        int[] newArray = new int[arr1.length+ arr2.length];
        for (int i=0; i<arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i=newArray.length-1; i>=arr2.length; i--) {
            newArray[i] = arr2[i- arr2.length];
        }
        System.out.println("\nThe new array is:");
        for(int i:newArray) {
            System.out.printf("%3d",i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(" Enter array 1");
//        System.out.println("Enter the number elements of array 1");
//        int number1 = input.nextInt();
//        System.out.println("Enter the number elements of array 2");
//        int number2 = input.nextInt();

        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6,8,10};
        System.out.println("The first array is:");
        for(int i:array1) {
            System.out.printf("%3d",i);
        }
        System.out.println("\nThe second array is:");
        for(int i:array2) {
            System.out.printf("%3d",i);
        }
        Concatenate(array1, array2);
    }
}

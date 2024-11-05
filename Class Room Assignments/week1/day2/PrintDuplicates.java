package week1.day2;

public class PrintDuplicates {

    public static void main(String[] args) {
        
        int[] arr = {2, 5, 7, 0, 0, 2, 7, 5, 9, 2, 3};
        
        int length = arr.length;
        int count;
        System.out.println("Duplicate Elements are : ");
        for (int i = 0; i < length - 1; i++) {
        	count = 0;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,9,2,8,3,5,4};
        int target;
        boolean isFound = false;
        System.out.print("Tell the target to found in array : ");
        target = scanner.nextInt();

        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == target){
                isFound = true;
                System.out.printf("The element is found at %d index",i);
                break;
            }
        }

        if(!isFound){
            System.out.println("The element is not found in the array");
        }

        scanner.close();
    }
}

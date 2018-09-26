import java.util.Scanner;
import java.util.Arrays;

class Solution {

   public static void main(String[] args) {
   System.out.println("Length of the array is:");
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int arr[] = new int[n];
   System.out.println("Elements in the array are : ");
   for(int i = 0; i < n; i++) {
       arr[i] = scan.nextInt();
   }
   Arrays.sort(arr);
    int check = 1;
    int count = 0;
        System.out.println("Count is : ");
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                check = check+1;
            } 
            else {
                count += (check*(check - 1))/2;
                check = 1;
            }
        }
        count += (check*(check - 1))/2;
        System.out.println(count);
    }
}
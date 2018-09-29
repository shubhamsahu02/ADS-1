import java.util.Scanner;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        LinkedList ll = new LinkedList();
        String [] arr = number.split("");
        for (int i = 0; i < arr.length; i++) {
            ll.push(arr[i]);
        }

        return ll;
    }

    public static String digitsToNumber(LinkedList list) {
        String string = "";
        while(!list.isEmpty()) {
            string+= list.pop();
        }

        return string;

    }

/**
 * Adding large numbers.
 *
 * @param LinkedList lis1
 * @param LinkedList list2
 * 
 * @return [description]
 */
    public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {
        return list1;
    }
}

/**
 *
 * Solution class.
 */
public class Solution {
    /**
     * Solution class.
     * 
     * @param String args
     */
    Solution() {

    }
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = 
                AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }

}

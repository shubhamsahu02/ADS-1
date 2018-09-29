import java.util.Scanner;
/**
 * Class for adding large numbers.
 */
class AddLargeNumbers {
    /**
     * To convert numbers to digits.
     *
     * @param number number
     *
     * @return number
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList ll = new LinkedList();
        String [] arr = number.split("");
        for (int i = 0; i < arr.length; i++) {
            ll.push(arr[i]);
        }

        return ll;
    }
    /**
     * To convert digits to numbers.
     *
     * @param  list list
     *
     * @return   list
     */
    public static String digitsToNumber(LinkedList list) {
        String string = "";
        while (!list.isEmpty()) {
            string += list.pop();
        }

        return string;

    }

    /**
     * Add large numbers.
     *
     * @param  list1  list 1
     * @param  list2  list 2
     *
     * @return   lists
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
     final LinkedList list2) {
        return list1;
    }
}

/**
 *
 * Solution class.
 */
public final class Solution {
    /**
     * Solution class.
     */
    private Solution() {

    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
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

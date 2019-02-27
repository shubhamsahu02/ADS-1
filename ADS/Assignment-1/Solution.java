import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */

    public static LinkedList numberToDigits(final String number) {
        LinkedList l = new LinkedList();
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            l.push(numbers[i]);
        }
        return l;
    }
    /**
     * Returns string of linked list.
     *
     * @param      list  The list
     *
     * @return     { string of link list }
     */
    public static String digitsToNumber(final LinkedList list) {
        // return list.toString();
        String string = "";
        while (!list.isEmpty()) {
            string += list.pop();
        }

        return string;
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { linkedlist of sum }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2)
    {
return null;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main method to take inputs and return outputs.
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
            LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
        break;
        }
    }

}
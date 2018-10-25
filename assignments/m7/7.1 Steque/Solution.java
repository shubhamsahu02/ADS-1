/**.
 * Imports Scanner package
 */
import java.util.Scanner;

/**.
 * Class for Solution
 */

public final class Solution {

    /**.
     * Default constructor
     */

    private Solution() {

    }

    /**.
     * Main method which describes the operations of steque.
     * @param      args  The arguments
     */

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < testcases; i++) {
            Steque ss = new Steque();
            while (scan.hasNext()) {
                String line = scan.nextLine();
                if (line.length() == 0) {
                    System.out.println();
                    break;
                }
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                case "pop":
                    ss.pop();
                    System.out.println(ss);
                    break;
                case "enqueue":
                    ss.enqueue(tokens[1]);
                    System.out.println(ss);
                    break;
                case "push" :
                    ss.push(tokens[1]);
                    System.out.println(ss);
                    break;
                default:
                    break;
                }
            }
        }
    }
}
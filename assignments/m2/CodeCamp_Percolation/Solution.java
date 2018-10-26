/**.
 * Imports Scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object for Soluiton class
     */
    private Solution() {

    }
    /**.
     * main function which demonstrates the operations of linked list.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
                case "size":
                System.out.println(ll.size());
                break;
                case "pushLeft":
                ll.pushLeft(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "pushRight":
                ll.pushRight(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "removeLeft":
                ll.removeLeft();
                System.out.println(ll);
                break;
                case "popLeft":
                ll.popLeft();
                System.out.println(ll);
                break;
                case "removeRight":
                ll.removeRight();
                System.out.println(ll);
                break;
                case "print" :
                ll.toString();
                System.out.println(ll);
                break;
                case "remove":
                ll.remove(Integer.parseInt(line[1]));
                System.out.println(ll);
                //ll.toString();
                default:
                break;
            }
        }
    }
}
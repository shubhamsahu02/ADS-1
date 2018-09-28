import java.util.Scanner;
/**.
 * List.
 */
class LinkedList {
    /**.
     * Node class.
     */

    private class Node {
        /**.
         * { var_description }
         */

        private char data;
        /**.
         * { var_description }
         */

        private Node nextadrr;
        /**.
        * { var_description }
        */
    }

    private Node head = null;

    public void push(final char item) {
        Node temp = new Node();
        temp.data = item;
        temp.nextadrr = head;
        head = temp;
    }

    public char pop() {
        char data = head.data;
        head = head.nextadrr;
        return  data;
    }

    public boolean isEmpty() {
        return  head == null;
    }
    /**.
     * { function_description }
     *
     * @return   description
     */

    public char top() {
        return head.data;
    }

}

public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() { 
    /**.
     * { item_description }
     */
    }
    /**.
     * { function_description }
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < k; i++) {
            String s = scan.next();
            if (theparantheses(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    /**.
     * { function_description }
     *
     * @param  s  parameter
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean theparantheses(final String s) {
        LinkedList l = new LinkedList();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                l.push(ch);
            } else {
                if (l.isEmpty()) {
                    return false;
                }
                if (ch == '}' && l.top() == '{') {
                    l.pop();
                } else if (ch == ']' && l.top() == '[') {
                    l.pop();
                } else if (ch == ')' && l.top() == '(') {
                    l.pop();
                } else {
                    return false;
                }

            }
        }
        return l.isEmpty();
    }
}
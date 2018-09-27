import java.util.Scanner;
import java.util.Arrays;
/**
 *Solution class.
 **/

public class Solution {

/**
 * @brief [brief description]
 * @details [long description]
 *
 * @param int argument
 */
    public void mergeArrays(final int[] a, final int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i];
                i++;
            } else {
                c[k++] = b[j];
                j++;
            }
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k++] = b[j];
                j++;
            }
        } else {
            while (i < a.length) {
                c[k++] = a[i];
                i++;

            }
        }
        int x;
        for (x = 0; x < c.length - 1; x++) {
            System.out.print(c[x] + ",");
        }
        System.out.println(c[x]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[m];
        int[] b = new int[n];
        String[] elements;
        if (m != 0) {
            elements = sc.nextLine().split(",");
            for (int i = 0; i < elements.length; i++) {
                a[i] = Integer.parseInt(elements[i]);
            }
        } else {
            sc.nextLine();
        }
        if (n != 0) {
            elements = sc.nextLine().split(",");
            for (int i = 0; i < elements.length; i++) {
                b[i] = Integer.parseInt(elements[i]);
            }
        }
        new Solution().mergeArrays(a, b);
    }
}
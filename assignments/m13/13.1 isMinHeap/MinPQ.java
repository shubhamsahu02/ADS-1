/**.
* Class for minimum pq.
*
* @param  <Key>  The key
*/
public class MinPQ <Key extends Comparable <Key>> {
	/**
	 * pq array of key type
	 */
	private Key[] pq;
	private int n;
	/**
	 * Constructs the object for class MinPQ
	 *
	 * @param array  The array
	 */
	MinPQ(final Key[] array) {
		this.pq = array;
		this.n = array.length - 1;
	}
	/**
	 * Checks if the array is min heap or not
	 * TIme complexity is N because the for loop iterates for N times.
	 * @return     True if minimum pq, False otherwise.
	 */
	public boolean isMinPQ(int k) {
		if (k > n) {
			return true;
		}
		int left = 2 * k;
		int rigth = 2 * k + 1;
		if (left <= n && !less(k, left)) {
			return false;
		}
		if (rigth <= n && !less(k, rigth)) {
			return false;
		}
		return isMinPQ(left) && isMinPQ(rigth);
	}
	public boolean isMinPQ() {
		return isMinPQ(1);
	}
	/**
	 * { compares two elements of pq array }
	 *  Time complexity is constant the statement is executed only once
	 * @param      i     { index of pq array }
	 * @param      j     { index of pq array }
	 *
	 * @return     { true if the condition is satisfied else it returns false}
	 */
	public boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}
}
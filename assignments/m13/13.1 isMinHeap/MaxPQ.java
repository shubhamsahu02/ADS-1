public class MaxPQ<Key extends Comparable <Key>> {
	private Key[] pq;
	private int n;
    public MaxPQ(int capacity) {
    	pq = (Key[]) new Comparable[capacity+1];
    }
    
}
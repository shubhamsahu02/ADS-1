class Heap {
	public static void sort(Comparable[] pq) {
		int N = pq.length;
		for (int i = N / 2; i > 0; i--) {
			sink(pq, i, N);
		}
		while (N > 1) {
           exchange(pq,1,N);
           sink(pq,1,--N);
		}
	}
	private static void sink(Comparable[] pq, int k, int n) {
            while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq,j, j+1)) j++;
            if (!less(pq,k, j)) break;
            exchange(pq,k, j);
            k = j;
        }
	}
	private static boolean less(Comparable[] pq, int i, int j) {
		 return pq[i].compareTo(pq[j]) < 0;

	}
	private static void exchange(Comparable[] pq, int i,int j) {
       Comparable swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
	}
}
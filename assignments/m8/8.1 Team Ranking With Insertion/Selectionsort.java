class Selectionsort {
    public static void sort(final Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a,i,min);
        }
    }
    private static boolean less(final Comparable i, final Comparable j) {
        return i.compareTo(j) < 0;
    }
    private static void exchange(final Comparable[] a,
        final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
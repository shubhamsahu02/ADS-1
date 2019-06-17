import java.util.*;
import java.util.TreeMap;

 public class Sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		TreeMap<Integer, Double> details = new TreeMap<Integer, Double>();
		TreeMap<Integer, Double> queries = new TreeMap<Integer, Double>();
		String[] tokens = new String[100];
		Double marks[] = new Double[n];
		for (int i = 0; i < n; i++) {
			tokens = scan.nextLine().trim().split(",");
			details.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
			marks[i] = Double.parseDouble(tokens[1]);
		}

		Double percent = 0.0;

		for (Integer key: details.keySet()) {
			int count = 0;


			for (int k = 0; k < marks.length; k++) {

				if(marks[k] <= details.get(key)) {
					 count++;

				}

			}
			percent = (100 * count)/Double.valueOf(n);


			queries.put(key, percent);


		}



		int q = scan.nextInt();
		for (int p = 0; p < q; p++) {
			int l = scan.nextInt();
			Double number = queries.get(l);
			System.out.println(Math.round(number*100)/100);

		}

		// System.out.println(details.keySet());
		// for (Integer key: details.keySet()) {
		// 	System.out.println(details.get(key));
		// }


	}

}
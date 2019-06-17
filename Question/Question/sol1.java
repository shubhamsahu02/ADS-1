import java.util.*;
import java.util.TreeMap;

public class sol1 {

	sol1() {

	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Integer, Double> tm = new TreeMap<>();
		TreeMap<Integer, Double> cal = new TreeMap<>();
		int range = Integer.parseInt(scan.nextLine());
		Double[] marks = new Double[range];
		for (int i = 0; i < range ; i++) {
			String[] tokens = scan.nextLine().split(",");
			tm.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
			marks[i] = Double.parseDouble(tokens[1]);
		}

		Double percent = 0.0;

			for (Integer key : tm.keySet()) {
				int count = 0;

				for (int k = 0; k < marks.length; k++) {
					if(marks[k] <= tm.get(key)) {
						count++;
					}
				}
					percent  = (100 * count)/Double.valueOf(range);

					cal.put(key, percent);
			}


		int q = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < q ; j++) {
			int num = Integer.parseInt(scan.nextLine());
			Double number = cal.get(num);
			System.out.println(number);

		}

 	}
}
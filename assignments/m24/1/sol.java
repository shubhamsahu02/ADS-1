import java.util.HashMap;
import java.util.*;


public class sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		HashMap<Integer, Double> marks = new HashMap<Integer, Double>(); 
		for (int i = 0; i < n; i++) {
			String[] str = scan.nextLine().split(",");
			name.put(Integer.parseInt(str[0]), str[1]);
			marks.put(Integer.parseInt(str[0]), Double.parseDouble(str[2]));
		}

		int k = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < k; j++) {
			String[] query = scan.nextLine().split(" ");
			switch (query[2]) {
				case "1" :
				System.out.println(name.get(Integer.parseInt(query[1])));
				break;

				case "2" :
				System.out.println(marks.get(Integer.parseInt(query[1])));

				break;
			}
		}


		}

	}
import java.util.*;
import java.util.HashMap;

public class sol1 {


	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int m = Integer.parseInt(scan.nextLine());
		scan.nextLine();
		String[] mag = scan.nextLine().split(" ");
		String[] note = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			if(hm.containsKey(mag[i])) {
				int count  = hm.get(mag[i]);
				hm.put(mag[i], count + 1 );
			}

			else {
				hm.put(mag[i], 1);
			}

		}
			boolean flag = true;
		for (int j = 0; j < m; j++) {
			if(hm.containsKey(note[j])) {
				int count = hm.get(note[j]);
				if (count == 0) {
					flag  = false;
					break;
				}
				hm.put(note[j], count - 1);
			}
					else {
					flag = false;
					break;
				}

		}

		if (flag) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}

	}
}
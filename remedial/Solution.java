import java.util.*;

class Member implements Comparable<Member> {
	int registration;
	int section;

	Member(int registration, int section) {
		this.registration = registration;
		this.section = section;
}

public String toString() {
		String reg = (this.registration + "," + this.section);
		return reg;
	}

	public int compareTo(Member that) {
		if(this.registration > that.registration) {
				return 1 ;
			}

		else if (this.registration < that.registration) { 
				return -1 ;
			}
		else {
			return 0;
		}
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MinPQ<Member> p = new MinPQ<Member>();
		while (s.hasNext()) {
			String[] input = s.nextLine().split(",");
			if(input.length > 1) {
				Member m = new Member(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
				p.insert(m);
			}
			if(input.length == 1 && input[0].equals("JC") && !(p.isEmpty())) {
				System.out.println(p.delMin());
			} else if (p.isEmpty()) {
				System.out.println("No Registration");
			}

		}
		System.out.println();
	}
}
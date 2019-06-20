import java.util.*;
import java.util.Arrays;

public class sol1 {


	sol1() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		// Team[] teams = new Team[];
		Sorting sort = new Sorting();
		while(scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			Team teams = new Team(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));	
			 // teams[i++] = new Team(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));	
			sort.add(teams);
		}
		sort.SelectionSort();

		String result = sort.display();
		System.out.println(result);
	}
}



class Team implements Comparable<Team>{
	String name;
	int win;
	int loss;
	int draw;

	Team(String name, int win, int loss, int draw) {
		this.name = name;
		this.win = win;
		this.loss = loss;
		this.draw = draw;
	}


	public String getName() {
		return this.name;
	}

	public int getWin() {
		return  this.win;
	}

	public int getLoss() {
		return this.loss;
	}

	public int getDraw() {
		return this.draw;
	}



	public int compareTo(final Team that) {

		if(this.win > that.win) {
			return -1;
		}

		if(this.win < that.win) {
			return 1;
		}

		if(this.loss > that.loss) {
			return 1;
		}

		if(this.loss < that.loss) {
			return -1;
		}

		if(this.draw > that.draw) {
			return -1;
		}

		if(this.draw < that.draw) {
			return 1;
		}
		return 0;
	}


public String toString() {
	String str = "";
	return str + this.name;
	}
}



class Sorting {
	Team[] names;
	int size;
	Sorting() {
		size = 0;
		names = new Team[10];
	}
	//takes O(n) time complexity.
	void add(Team objstudent) {
		names[size++] = objstudent;
		if(size > 10) {
			resize();
		}
	}
	//takes O(n) complexity.
	void resize() {
		names = Arrays.copyOf(names, size * 2);
	}
	//takes O(n) time complexity.
	void exchange(Team[] a, int i, int min) {
		Team temp = a[min];
		a[min] = a[i];
		a[i] = temp;
	}
	//takes O(n) time complexity.
	String display() {
		String s = "";
		// String[] temp = new String[100];
		for(int i = 0; i < size; i++) {
			System.out.println(names[i]);
			s += names[i].name + ",";

		}
		// return temp;
		return s.substring(0, s.length() - 1);
	}
	//takes O(n^2) time complexity.
	void SelectionSort() {
		for(int i = 0; i < size-1; i++) {
			int min = i; 
			for(int j = i+1; j > 0; j--) {
				if(!less(names,j,j-1)) {
					exchange(names,j,j-1);		
				}
			}
			
			
		}
	}
	//takes O(1) time complexity.
	boolean less(Team[] names, int j, int min) {
		return names[j].compareTo(names[min]) > 0;
	}
}
import java.util.*;
import java.util.Arrays;

public class sol {

	sol () {

	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sorting sort = new Sorting();
		while (scan.hasNext()) {
		String[] token = scan.nextLine().split(" ");
		Team teams = new Team(token[0], Integer.parseInt(token[1]),Integer.parseInt(token[2]),Integer.parseInt(token[3]));
		sort.add(teams);
		}
		sort.Insertion();
		System.out.println(sort.display());
	}
}


class Team {

	String team;
	int win;
	int loss;
	int draw;

	Team(String team, int win, int loss, int draw) {
		this.team = team;
		this.win = win;
		this.loss = loss;
		this.draw = draw;
	}

	public String getTeam() {
		return team;
	}

	public int getWin() {
		return win;
	}

	public int getLoss() {
		return loss;
	}

	public int getDraw() {
		return draw;
	}

	public int compareTo(Team that) {
		if(this.win > that.win) {
			return 1;
		}

		if (this.win < that.win) {
			return -1;
		}

		if(this.loss > that.loss) {
			return 1;
		}

		if (this.loss < that.loss) {
			return -1;
		}

		if(this.draw > that.draw) {
			return 1;
		}

		if (this.draw < that.draw) {
			return -1;
		}

		return 0;





	}


	public String toString() {
		String str = "";
		return str + this.team;
	}
}


class Sorting {

	Team[] array;
	int size;

	Sorting() {
		size = 0;
		array = new Team[20];
	}

	public void add(Team obj) {
		array[size++] = obj;
		if(size > 20) {
			resize();
		}
	}

	public void resize() {
		array = Arrays.copyOf(array, size * 2);
	}

	   void Insertion() {
        // int num = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array[j], array[j - 1])) {
                    exchange(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }


       void exchange(final Team[] arr,
        final int i, final int j) {
        Team swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }

     boolean less(final Team v, final Team w) {
         return (v.compareTo(w)) < 0;
    }

    public String display(){
    	String s = "";
    	for (int i = 0; i < size; i++) {
    		s = s + array[i].team + ",";
    	}

    	return s.substring(0, s.length() - 1);

    }
}
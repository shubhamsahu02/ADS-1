class Candidate implements Comparable<Candidate> {

	String name, degree;
	int studid;
	double percentage;

public Candidate(int studid, String name, String degree, double perecentage) {
	this.studid = studid;
	this.name = name;
	this.degree = degree;
	this.percentage = percentage;
}

	public int getId() {
		return studid;
	}

	public void setId(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree() {
		this.degree = degree;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage() {
		this.percentage = percentage;
	}

	public int compareTo(Candidate that) {
		if(this.percentage > that.percentage) {
			return 1;
		}

		if (this.percentage < that.percentage) {
			return -1;
		}

		if(this.studid < that.studid) {
			return 1;
		}

		if(this.studid > that.studid) {
			return -1;
		}


			return 0;




	}
		public String toString(){
		String string = "";
		string = string + this.studid  +"," + this.name +"," +  this.degree + ","+ this.percentage;
		return string;


	}




}
package lab.java.core;

public class Movie {
	private String title;
	private String director;
	private String genre;
	private String actor;
	private int releaseYear;
	private int runTime;
	private String rating;
	
	public Movie(String title, String director, String genre, String actor, String rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.actor = actor;
		this.rating = rating;
	}
	
	public Movie(String title, String director, String genre, String actor, int releaseYear, int runTime) {
		this(title, director, genre, actor, null);
		this.releaseYear = releaseYear;
		this.runTime = runTime;
	}
	
	public Movie(String title, String director, String genre, String actor, int releaseYear, int runTime,String rating) {
		this(title, director, genre, actor, releaseYear, runTime);
		this.rating = rating;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getActor() {
		return actor;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public int getRunTime() {
		return runTime;
	}
	
	public String getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return String.format("%-18s%-12s%-12s%-10s%-10s%-10s%-20s"
				, title
				, director
				, genre
				, actor
				, releaseYear == 0 ? "N/A...." :  releaseYear + "년"
				, runTime == 0 ? "N/A...." :  runTime + "분"
				, rating == null ? "N/A...." : rating
		).replace(" ","  ");
	}
	
	
}

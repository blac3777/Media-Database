import java.util.ArrayList;

public class Database {
	private ArrayList<Movie> movies;
	private ArrayList<Show> shows;
	
	/**
	 * Default constructor
	 */
	public Database(){
		
	}
	
	/**
	 * Fills the database
	 * @param fileName The name of the file
	 */
	public void fillDatabase(String fileName){
		
	}
	
	/**
	 * Parses the movie information
	 * @param infoLine
	 */
	protected void parseMovie(String infoLine){
		
	}
	
	/**
	 * Parses the movie title
	 * @param cArray
	 * @return title The movie title
	 */
	protected String parseTitle(char[] cArray){
		return null;
	}
	/**
	 * Parses the movie year
	 * @param cArray
	 * @return year The movie year
	 */
	protected String parseYear(char[] cArray){
		return null;
	}
	/**
	 * Parses the movie type
	 * @param cArray
	 * @return type The movie release type
	 */
	protected String parseType(char[] cArray){
		return null;
	}
	/**
	 * Parses the show season
	 * @param cArray
	 * @return season The season
	 */
	protected String parseSeason(char[] cArray){
		return null;
	}
	/**
	 * Parses the episode number
	 * @param cArray
	 * @return epNum The episode number
	 */
	protected String parseEpNum(char[] cArray){
		return null;
	}
	/**
	 * Parses the TV show
	 * @param cArray
	 * @return show The movie title
	 */
	protected String parseShow(char[] cArray){
		return null;
	}
	/**
	 * Parses the episode
	 * @param cArray
	 * @return episode The episode
	 */
	protected String parseEpisode(char[] cArray){
		return null;
	}
	/**
	 * Trims the year off the information line
	 * @param cArray
	 * @return line The trimmed line
	 */
	protected String trimLine(char[] cArray){
		return null;
	}
	
	/**
	 * Searches through movies by title
	 * @param title
	 * @return results The search results
	 */
	public String findMoviesTitle(String title){
		return null;
	}
	/**
	 * Searches through the shows
	 * @param show
	 * @return results The search results
	 */
	public String findShow(String show){
		return null;
	}
	/**
	 * Finds the episode title
	 * @param episode
	 * @return title The episode title
	 */
	public String findEpisode(String episode){
		return null;
	}
}

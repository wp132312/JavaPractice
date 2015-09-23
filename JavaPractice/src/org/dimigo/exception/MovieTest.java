/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception.MovieTest
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 9. 23.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Movie[] movies = {
					new Movie("앤트맨", 12), 
					new Movie("사도", 12), 
					new Movie("베테랑", 15)
			};
			
			int age = 13;
			
			for(Movie movie : movies) {
				buyTicket(movie, age);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void buyTicket(Movie movie, int age) throws Exception{
		if(movie.getLimitAge()>age) {
			throw new AgeCheckException(movie);
		} else {
			System.out.println(movie.getTitle()+" 영화 즐감하세용~~");
		}
	}

}

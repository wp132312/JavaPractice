/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception.Movie
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 9. 23.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Movie {
	
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
}

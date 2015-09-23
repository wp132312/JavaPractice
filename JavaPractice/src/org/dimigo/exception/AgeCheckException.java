/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception.AgeCheckException
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 9. 23.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class AgeCheckException extends Exception {
	
	public AgeCheckException() {}

	public AgeCheckException(Movie movie) {
		super(movie.getTitle()+"은/는 "+movie.getLimitAge()+"세 이상 관람가입니다.");
	}
}

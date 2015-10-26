package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io.SaveImageFromUrl
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 10. 26.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		String image_url = "https://static.dimigo.in/img/logobeta.png";
		
		try {
			URL url = new URL(image_url);
		
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("완료!");
	}

}

/**
 * 
 */
package mmr.hackerrank.data.structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author muhammed.rahman (oncmmr@gmail.com)
 *
 */
public class MakingAnagrams {

	/**
	 * @param args
	 */
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String a = scanner.nextLine();
		char[] chars1 = a.toLowerCase().toCharArray();
        Arrays.sort(chars1);
		
        String b = scanner.nextLine();
        char[] chars2 = b.toLowerCase().toCharArray();
        Arrays.sort(chars2);
		
        scanner.close();
	}	


}

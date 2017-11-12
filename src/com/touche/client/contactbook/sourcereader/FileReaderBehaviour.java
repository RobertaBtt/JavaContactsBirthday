/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.sourcereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReaderBehaviour  implements SourceReaderBehaviour {

	public List<String> readSource(String source) {
		
	
		List<String> linesFromSource = null;
		
		try {
				linesFromSource = readContactsFromLines(source);
			
		} catch (FileNotFoundException e) {
			System.out.println ("File not Found" + source);	
			e.printStackTrace();
		}
				
		return linesFromSource;
	}
	
	
	private List<String> readContactsFromLines(String source) throws FileNotFoundException{
		
		List<String> linesFromSource = new ArrayList<String>();
		Scanner fileScanner;
		try{
			fileScanner = new Scanner(new File(source));
			while (fileScanner.hasNextLine()){
				linesFromSource.add(fileScanner.nextLine());				
			}
			fileScanner.close();
		}
		catch (FileNotFoundException e) {
			linesFromSource = new ArrayList<String>();
			throw e;
		}
		
		return linesFromSource;
		
	}
	
}

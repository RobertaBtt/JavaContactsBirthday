/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.sourcereader;

import java.util.List;

public class DatabaseReaderBehaviour  implements SourceReaderBehaviour {

	public List<String> readSource(String source) {
		String databaseConnection = source;
		System.out.print("Not implemented yet " + databaseConnection);
		/*Run SQL query like "Select * from table.Employee"*/
		return null;
	}

}

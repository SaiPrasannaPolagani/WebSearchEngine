package searchEngine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Searching a word in all the converted text files using Edit Distance
 * @author Rahul Banerjee
 */

public class linesToWords {

	public static  void splitWords() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		ArrayList<String> result = new ArrayList<>();

		String filePath=  "C:\\Users\\rbane\\OneDrive\\Desktop\\ACC\\output.txt";
		try (FileReader f = new FileReader(filePath)) {
		    StringBuffer sb = new StringBuffer();
		    while (f.ready()) {
		        char c = (char) f.read();
		        if (c == ' '||c == '\n'||c == ','||c =='.'||c == ';'||c == ':'||c == '&'||c =='|') {
		            result.add(sb.toString());
		            sb = new StringBuffer();
		        } else {
		            sb.append(c);
		        }
		    }
		    if (sb.length() > 0) {
		        result.add(sb.toString());
		    }
		}       
		FileWriter writer = new FileWriter("C:\\\\Users\\\\rbane\\\\OneDrive\\\\Desktop\\\\ACC\\\\output.txt"); 
		for(String str: result) {
		  writer.write(str + System.lineSeparator());
		}
		writer.close();
	}

}


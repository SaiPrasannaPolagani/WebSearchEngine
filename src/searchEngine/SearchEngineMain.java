package searchEngine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
*  Search Engine Start 
*  Conversion of html to text 
*  Storage of converted text file to local
*/

public class SearchEngineMain {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException{
	
		/*Web page crawling and conversion to html */
		webPageCrawler web = new webPageCrawler();
		web.Crawler();
		
		/*Conversion finished from html to text*/
		
		/* User Interaction start */
		Scanner userInput = new Scanner(System.in);  
		
		
		/* Switch Case */
		
	  switchCase();
	  
	    
	  
	}
	
	  public static void switchCase() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException
	    {
	    	Scanner userInput = new Scanner(System.in);  
		    System.out.println("Please enter the feature to be searched: "
		    		+ "\n 1. Regular Expression"
		    		+ "\n 2. TST"
		    		+ "\n 3. Edit Distance"
		    		+ "\n 4. Inverted Index"
		    		+ "\n 5. Frequency Count");

		    int feature = userInput.nextInt();  // Read user input
	    switch (feature) {
	      case 1:
	        RegExpression reg = new RegExpression();
	        System.out.println("Choose a number!\n1 :\tEmail Adresses\n2 :\tWeb Links\n3 :\tPostal Codes\n4 :\tPhonenumbers\n");
			int choice = new Scanner(System.in).nextInt();
			reg.findPatterns(choice);
	        break;
	   
	      case 2:
	    	  tstSearch tst = new tstSearch();
	    	  System.out.println("Please enter the word \n");
	    	  String word = userInput.next();
	    	  
	    	  System.out.println("\n Do you want a partial or exact word \n"
	    	  		+ "1. Exact word Search "
	    	  		+ "2. Prefix search");
	    	  int cho = new Scanner(System.in).nextInt();
	    	  tst.tstSearching(word, cho);
	    	  break;
	    	  
	      case 3:
	    	  mergeTextFiles.mergeFiles();
			    linesToWords.splitWords();
	  		  editDistance.run();
		      break;
		      
	      case 4: 
	    	  InvertedIndex ii = new InvertedIndex();
	  			ii.InvertedIndexCreate();
	  			break;
	  			
	      case 5:
	    	  FrequencyCount.WordCount();
	    	  break;
	    	  
	    	  
	    }
	    moreSearch();
	    }
	  
	  public static void moreSearch() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException{
			System.out.println("\nMore Search?(yes/no)");
			Scanner sc = new Scanner(System.in);  
			String more = sc.next();
			if(more.equalsIgnoreCase("yes"))
				switchCase();
			else
				System.out.println("\nThank You!");
		}	
}

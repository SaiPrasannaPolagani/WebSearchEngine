package searchEngine;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyCount {
			
		public static void WordCount() throws IOException{
			
			 HashMap <String,Integer> hm = new HashMap<String,Integer>(); //hashmap object to store the words
			 BufferedReader br = null;
			 try {
				 Scanner sc= new Scanner(System.in);
				 File myFolder = new File("C:\\Users\\Dell\\Desktop\\searchEngine-main\\convertedWebPages"); //reading the converted text files
				 File[] files = myFolder.listFiles();
				 System.out.println("Enter a word to search: "); 
				 String userInput= sc.nextLine();                 //reading user input
				 
				 for (File file : files) {
					br =  new BufferedReader(new FileReader(file)); 
 					String str = br.readLine();  					// reading the content lines in the files

				 while(str!=null) {
					 String words[]= str.toLowerCase().split(" ");   // getting the words
					 for(String word:words) {
						 if(hm.containsKey(word)) {       //search for the word in hashmap
							 hm.put(word,hm.get(word)+1);   
							 
						 }
						 else {
							 hm.put(word,1);	 
						 }
					 }
					 str=br.readLine();
				 }
				 if(hm.containsKey(userInput)) 
					 System.out.println(userInput + " repeated " +hm.get(userInput)+" times in "+ file.getName()); 
				 else
					 System.out.println("Word not found in "+ file.getName());
				 }
				 
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	     finally {
	    	 br.close();
	     }
			 
	  }

 }

package fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountWordsFromFile {

	public static void main(String[] args) throws Exception{
		
		String fileName = "F://Vishal//temp.txt";
		int count = 0;
		String str;
		String[] strArray;
		String word = "abc";
		File f = new File(fileName);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while ((str = br.readLine()) != null) {
			strArray = str.split(" ");
			for (String s : strArray) {
				if(s.equals(word)) {
					count++;
				}
			}
		}
		if(count==0){
	         System.out.println("Word not found!");
	      }
	    else{
	         System.out.println("Word : "+word+" found! Count : "+count);
	      }
	      
		br.close();
	    fr.close();
	}
}

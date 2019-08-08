package edu.gcu.cst235.rest.worker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Alice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static int searchAlice(String word) {
		File file = new File("C:\\Users\\max\\Documents\\Eclipse Java Advance\\CST-235\\RestTutorial\\alice.txt");
		int count = 0;
		BufferedReader buff;

		try {
			buff = new BufferedReader(new FileReader(file));
			String line;
			while((line = buff.readLine()) != null) {
				System.out.println(line);
				if (line.contains(word))
					count++;
			}
			buff.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return count;
	}

}

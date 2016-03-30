/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
  import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
/**
 *
 * @author Neha Ghate
 */
public class WriteToFile {

    public WriteToFile(String content) {
        
        WriteToFile.getData(content);
    }
    
	public static void getData(String content ) {
		try {

			//String content = "This is the content to write into file";

			//File file = new File("C://My Work//AED//filename1.txt");
                        //File file = new File("C://Users//Neha Ghate//Documents//GitHub//ghate_neha_001617639//Project_1//docs//logFile.txt");
                        File file = new File("logFile.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("The following is the log for "+ new Date() +" :");
			bw.write(content);
                        //write(content);
                        bw.newLine();
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
}
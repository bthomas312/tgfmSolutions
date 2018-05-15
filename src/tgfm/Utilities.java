
package tgfm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utilities {
	
   // public static WebDriver browser = null;

	
	  public static String[][] ReadTestData(String pathToCSVfile) throws Exception{
			
		//	HashMap<String,String> theMap = new HashMap<String,String>();

		  
          //Create object of FileReader
          FileReader inputFile = new FileReader(pathToCSVfile);
          
          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);
       
          //Variable to hold one line data
          String line;
          int NumberOfLines = 0;
        
          String[][] data = new String[1000][25]; // set the max rows to 1000 and col to 100
          
          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
        	  
        	  String[] lineArray = line.split(Pattern.quote(",")); //split the line up and save to array
        	  int lineSize = lineArray.length;
        	  int z;
        	  for (z = 0; z <= (lineSize-1);)
        	  {
        		  data[NumberOfLines][z] = lineArray[z].toString();
        		  z++;
        	  } 
        	  
        	  if(z <= 25) // read in 25 cols to make sure the array does not have nulls that other areas of the code are looking in
        	  {	        		  
        		  while (z <= 24)
	        	  {		        
        			  data[NumberOfLines][z] = " ";
	        		  z++;
	        	  }  
        	  }
        	  NumberOfLines++;  
        	  
          }
          
          bufferReader.close();
          
        //  for (int h=0; h< NumberOfLines; h++) {theMap.put(data[h][0],data[h][1]); }
          
          
          System.out.println("Test Data has been saved ");   
          
        	  
          return data;
          
	  
	}
	  
	  public static <Screenshot> String[][] saveScreenShot(String fileName) throws Exception{
			
		  
		File scrFile = ((TakesScreenshot)Browser.getBrowser()).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(scrFile, new File("c:\\tmp\\"+ fileName +".png"));
		
		return null;
	  }
	  
		public static String getRandomEmail() throws InterruptedException {
			int randomNum = 0 + (int)(Math.random()*100); 
			int randomNum2 = 500 + (int)(Math.random()*500); 
			String email = "ben."+randomNum + randomNum2+".web@wildtest.com";
				
			return email;
		}

		public static int randomNumber()
		{
			int ranNum = (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1) + (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1) + (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1)+1 + (int)(Math.random() * (10-1) +1);
			return ranNum;
		}

		
		
		public static void print(String level, String toPrint) {
			
			System.out.println("[" + level.toUpperCase() +"] - " + toPrint);
			
		}



}

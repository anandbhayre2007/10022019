package delete;

import java.io.File;

public class Testing {

	public static void main(String[] args) 
	{
		String path="D:\\Testing";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
			  System.out.println(listOfFiles[i].getName());
		     listOfFiles[i].delete();
		  } 
		}
		
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");

	}

}

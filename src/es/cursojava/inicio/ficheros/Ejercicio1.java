package es.cursojava.inicio.ficheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final  String DIR_BASE = "C:\\Users\\Tardes\\Ficheros";
		 final  String DIR_IMAGES = "\\Images";
		 final  String DIR_DOCUMENTS = "\\Documents";
		 final  String DIR_OTHERS = "\\Others";
		//create the file object
		File directory = new File(DIR_BASE);

		//if the directory doesn't exist, create it
		if (!directory.exists()) {
			directory.mkdir();
		}

		//create the sub directories
		File images = new File(directory, DIR_IMAGES);
		images.mkdir();

		File documents = new File(directory, DIR_DOCUMENTS);
		documents.mkdir();

		File others = new File(directory, DIR_OTHERS);
		others.mkdir();

		File file = null;
		for (int i = 0; i < 5; i++) {
			String fileName = UtilidadesFicheros.pideDatoCadena("Enter the file name " + (i + 1) + ": ");
			
        	if(fileName.endsWith(".gif") || fileName.endsWith(".jpg") ||  fileName.endsWith(".png")) {
        		file = new File(images,"\\"+fileName);
        	}else if(fileName.endsWith(".txt")) {
        		file = new File(documents,"\\"+fileName);
        	}
        	else {
        		file = new File(others,"\\"+fileName);
        	}
        	try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("===================== Existing content in 'Ficheros' ====================");
		UtilidadesFicheros.showFileContent(directory);
		UtilidadesFicheros.renameFilesName(others);
		System.out.println("===================== Renaming 'Otros' file names ====================");
		UtilidadesFicheros.showFileContent(others);
	}

}

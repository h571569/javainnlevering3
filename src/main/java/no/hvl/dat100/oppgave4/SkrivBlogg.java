package no.hvl.dat100.oppgave4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {


		// METODE 1

//		String folderPath = Paths.get(mappe, filnavn).toString();
//		java.nio.file.Path path = Paths.get(folderPath);
//
//		try {
//			if (!java.nio.file.Files.exists(path)) {
//				java.nio.file.Files.createDirectories(path);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter(folderPath))) {
//			writer.write(samling.toString());
//			writer.newLine();
//			return true;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		}




		//METODE 2
		
		Path folderPath = Paths.get(mappe);
		Path filePath = Paths.get(filnavn);

		try {
			Files.createDirectories(folderPath);

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
				writer.write(samling.toString());
				writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

package com.pradeep.geek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeFormatter {
	public static void storeInformation(String key, String value) {
		
		BufferedWriter writer = null;
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH:mm");
		String loginFilename = "LoginDataCreatedAt_" + formatter.format(new Date()).toString().replace("-", "_").replace(":", "_");
		
		
		try {
			File f = new File(System.getProperty("user.home") + "/Desktop/" + loginFilename+".txt" );
			
			if (!(f.exists())) {
				f.createNewFile();
			}

			writer = new BufferedWriter(new FileWriter(f, true));
			

			if (value.startsWith("@")) {
				TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
				String text = formatter.format(new Date()).toString();
				writer.write("------------------------------------------"+text + "------------------------------------------\n");
			}else {
				writer.write(key + "\t\t\t\t\t\t:" + value + "\n");
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
              System.out.println("exception arise");
		}
	}

	public static void main(String[] args) {
		storeInformation("test", "@pradeep");

	}

}

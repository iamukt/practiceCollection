package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupEmailsMain
{
	private static List<Map<String, Email>> finalCollection;
	private static Map<String, Email> map;
	private static Map<String, Email> gmailmap;
	private static Map<String, Email> yahoomap;
	private static Map<String, Email> rediffmap;

	//Loading the records from the file
	public static void feedingIntoDatabase() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("emailRecords"));
		String line;
		while((line=br.readLine())!=null)
		{
			String[] records = line.split(" ");
			Email email = new Email(records[0],records[1],records[2]);
			map.put(email.getEmailId(), email);
		}
		System.out.println("Given Collection is: "+map);
	}

	public static void main(String[] args) throws IOException {
		map = new TreeMap<>();
		gmailmap= new TreeMap<>();
		yahoomap= new TreeMap<>();
		rediffmap = new TreeMap<>();
		finalCollection = new ArrayList<>();
		feedingIntoDatabase();
		mainLogic();
	}

	//Main Login that will perform the logic
	public static void mainLogic() 
	{
		ArrayList<Email> aList = new ArrayList<>(map.values());
		for (Email i : aList) 
			if(i.getEmailId().contains("gmail"))
				gmailmap.put(i.getUsername(),i);
			else if(i.getEmailId().contains("yahoo"))
				yahoomap.put(i.getUsername(),i);
			else 
				rediffmap.put(i.getUsername(),i);
		finalCollection.add(gmailmap);
		finalCollection.add(yahoomap);
		finalCollection.add(rediffmap);
		System.out.println(finalCollection);
	}
}

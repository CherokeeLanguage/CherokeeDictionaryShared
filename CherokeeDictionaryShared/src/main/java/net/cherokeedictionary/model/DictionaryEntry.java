package net.cherokeedictionary.model;

import java.util.ArrayList;
import java.util.List;

public class DictionaryEntry {
	public int id;
	public String source;
	public String pos;
	
	public List<EntryForm> forms=new ArrayList<>();
	public List<String> definitions=new ArrayList<>();
	public List<EntryExample> examples=new ArrayList<>();
	public List<Note> notes=new ArrayList<>();
	public List<Crossreference> crossreferences=new ArrayList<>();
	
	public static class EntryForm {
		public String syllabary;
		public String pronunciation;
		public String translit;
	}
	
	public static class EntryExample {
		public String syllabary;
		public String translit;
		public String english;
	}
	
	public static class Note {
		public String note;
	}
	
	public static class Crossreference {
		public String crossReference;
	}
}

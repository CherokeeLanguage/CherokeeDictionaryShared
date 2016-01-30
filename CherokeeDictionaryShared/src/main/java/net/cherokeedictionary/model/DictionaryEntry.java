package net.cherokeedictionary.model;

import java.util.List;

public class DictionaryEntry {
	public int id;
	public String source;
	public String pos;
	
	public List<EntryForm> forms;
	public List<String> definitions;
	public List<EntryExample> examples;
	public List<Note> notes;
	public List<Crossreference> crossreferences;
	
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

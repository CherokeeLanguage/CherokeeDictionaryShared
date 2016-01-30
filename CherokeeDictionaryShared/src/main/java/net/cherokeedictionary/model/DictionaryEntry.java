package net.cherokeedictionary.model;

import java.util.ArrayList;
import java.util.Date;
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
	
	public Date modified;
	
	public static class EntryForm {
		public EntryForm() {
		}
		public EntryForm(EntryFormType formType, String syllabary, String pronunciation, String latin) {
			this.formType=formType;
			this.syllabary=syllabary;
			this.pronunciation=pronunciation;
			this.latin=latin;
		}
		public EntryFormType formType=EntryFormType.Other;
		public String syllabary;
		public String pronunciation;
		public String latin;
	}
	
	public static class EntryExample {
		public EntryExample() {
		}
		public EntryExample(String syllabary, String latin, String english) {
			this.syllabary=syllabary;
			this.latin=latin;
			this.english=english;
		}
		public String syllabary;
		public String latin;
		public String english;
	}
	
	public static enum EntryFormType {
		Verb3rdPrc, Verb1stPrc, Verb3rdPast, Verb3rdHab, Verb2ndImp, Verb3rdImp, Verb3rdInf, Other;
	}
	
	public static class Note {
		public Note() {
		}
		public Note(String note) {
			this.note=note;
		}

		public String note;
	}
	
	public static class Crossreference {
		public Crossreference() {
		}
		public Crossreference(String crossreferencet) {
			this.crossReference=crossreferencet;
		}

		public String crossReference;
	}
}

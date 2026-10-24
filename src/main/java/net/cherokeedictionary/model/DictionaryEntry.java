package net.cherokeedictionary.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictionaryEntry implements Comparable<DictionaryEntry> {
	public int id;
	public String source;
	public String pos;
	
	public List<EntryForm> forms=new ArrayList<>();
	public List<String> definitions=new ArrayList<>();
	public List<EntryExample> examples=new ArrayList<>();
	public List<Note> notes=new ArrayList<>();
	public List<Crossreference> crossreferences=new ArrayList<>();
	
	public Date modified;
	
	public DictionaryEntry() {
	}
	
	/**
	 * Creates a new object that is a <strong>shallow</strong> copy of the source.
	 * @param entry
	 */
	public DictionaryEntry(DictionaryEntry entry){
		id=entry.id;
		source=entry.source;
		pos=entry.pos;
		forms.addAll(entry.forms);
		definitions.addAll(entry.definitions);
		examples.addAll(entry.examples);
		notes.addAll(entry.notes);
		crossreferences.addAll(entry.crossreferences);
		modified=entry.modified;
	}
	
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
	
	private String _sortKey=null;
	private String getSortKey(){
		if (_sortKey!=null) {
			return _sortKey;
		}
		StringBuilder sb = new StringBuilder();
		for (EntryForm form: forms){
			if (form.syllabary!=null&&!form.syllabary.isEmpty()) {
				if (sb.length()!=0) {
					sb.append("-");
				}
				sb.append(form.syllabary);
			}
		}
		for (EntryForm form: forms){
			if (form.pronunciation!=null&&!form.pronunciation.isEmpty()) {
				if (sb.length()!=0) {
					sb.append("-");
				}
				sb.append(form.pronunciation);
			}
		}
		_sortKey=sb.toString();
		return _sortKey;
	}

	@Override
	public int compareTo(DictionaryEntry o) {
		return getSortKey().compareTo(o.getSortKey());
	}
}

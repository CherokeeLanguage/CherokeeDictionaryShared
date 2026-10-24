package net.cherokeedictionary.model;

public enum SearchIndex {
	English(Table.tableEnglish), Latin(Table.tableLatin), Syllabary(Table.tableSyllabary);

	private SearchIndex(String table) {
		this.table = table;
	}

	public String getTable() {
		return table;
	}

	private final String table;
	
	public static class Table {
		public static final String tableEnglish="dictionary_index_english";
		public static final String tableLatin="dictionary_index_latin";
		public static final String tableSyllabary="dictionary_index_syllabary";
	}
}

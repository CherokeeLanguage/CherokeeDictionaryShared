package net.cherokeedictionary.model;

public enum SearchField {
	
	/*
	 * The defined indexes must match these EXACTLY. Note that 'forms,examples' is a 3rd index!
	 */
	All("forms,examples"), Forms("forms"), Examples("examples");
	
	private final String fields;
	private SearchField(String fields) {
		this.fields=fields;
	}
	public String getFields() {
		return fields;
	}
}

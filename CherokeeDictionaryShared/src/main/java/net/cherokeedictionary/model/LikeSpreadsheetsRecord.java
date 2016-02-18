package net.cherokeedictionary.model;

import java.util.Date;

public class LikeSpreadsheetsRecord {
	public String category;
	public String crossreferencet;
	public String definitiond;
	public String definitionlarge;
	public String entrya;
	public String entrytone;
	public String entrytranslit;
	public String etymology;
	public int id;
	public Date modified;
	public String notes;
	public String nounadjplurale;
	public String nounadjpluralsyllf;
	public String nounadjpluraltone;
	public String nounadjpluraltranslit;
	public String partofspeechc;
	public String sentenceenglishs;
	public String sentenceq;
	public String sentencesyllr;
	public String sentencetranslit;
	public String source;
	public String syllabaryb;
	public int version;
	public String vfirstpresg;
	public String vfirstpresh;
	public String vfirstprestone;
	public String vfirstprestranslit;
	public String vsecondimperm;
	public String vsecondimpersylln;
	public String vsecondimpertone;
	public String vsecondimpertranslit;
	public String vthirdinfo;
	public String vthirdinfsyllp;
	public String vthirdinftone;
	public String vthirdinftranslit;
	public String vthirdpasti;
	public String vthirdpastsyllj;
	public String vthirdpasttone;
	public String vthirdpasttranslit;
	public String vthirdpresk;
	public String vthirdpressylll;
	public String vthirdprestone;
	public String vthirdprestranslit;
	
	public void noNulls(){
		category=defaultString(category);
		crossreferencet=defaultString(crossreferencet);
		definitiond=defaultString(definitiond);
		definitionlarge=defaultString(definitionlarge);
		entrya=defaultString(entrya);
		entrytone=defaultString(entrytone);
		entrytranslit=defaultString(entrytranslit);
		etymology=defaultString(etymology);
		notes=defaultString(notes);
		nounadjplurale=defaultString(nounadjplurale);
		nounadjpluralsyllf=defaultString(nounadjpluralsyllf);
		nounadjpluraltone=defaultString(nounadjpluraltone);
		nounadjpluraltranslit=defaultString(nounadjpluraltranslit);
		partofspeechc=defaultString(partofspeechc);
		sentenceenglishs=defaultString(sentenceenglishs);
		sentenceq=defaultString(sentenceq);
		sentencesyllr=defaultString(sentencesyllr);
		sentencetranslit=defaultString(sentencetranslit);
		source=defaultString(source);
		syllabaryb=defaultString(syllabaryb);
		vfirstpresg=defaultString(vfirstpresg);
		vfirstpresh=defaultString(vfirstpresh);
		vfirstprestone=defaultString(vfirstprestone);
		vfirstprestranslit=defaultString(vfirstprestranslit);
		vsecondimperm=defaultString(vsecondimperm);
		vsecondimpersylln=defaultString(vsecondimpersylln);
		vsecondimpertone=defaultString(vsecondimpertone);
		vsecondimpertranslit=defaultString(vsecondimpertranslit);
		vthirdinfo=defaultString(vthirdinfo);
		vthirdinfsyllp=defaultString(vthirdinfsyllp);
		vthirdinftone=defaultString(vthirdinftone);
		vthirdinftranslit=defaultString(vthirdinftranslit);
		vthirdpasti=defaultString(vthirdpasti);
		vthirdpastsyllj=defaultString(vthirdpastsyllj);
		vthirdpasttone=defaultString(vthirdpasttone);
		vthirdpasttranslit=defaultString(vthirdpasttranslit);
		vthirdpresk=defaultString(vthirdpresk);
		vthirdpressylll=defaultString(vthirdpressylll);
		vthirdprestone=defaultString(vthirdprestone);
		vthirdprestranslit=defaultString(vthirdprestranslit);
	}
	
	private static String defaultString(String text) {
		return text == null ? "" : text;
	}
	
}

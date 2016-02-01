package reserve.natural.wildlifeiducsc;

import android.app.Activity;
import android.widget.Spinner;
import android.widget.TextView;

public class Question {

	//Fields
	String question = null;
	String[] responses = null;
	Spinner s = null;
	TextView t = null;
	String traitName = null;

    public Question(){}
	
	// Constructor
	public Question (String question, String[] responses, String traitName){
		this.responses = responses;
		this.traitName = traitName;
		this.question = question;
	}

	// sets the responses
	public void setResponses (String[] responses){
		this.responses = responses;		
	}
	
	// gets the responses
	public String[] getResponses (){
		return this.responses;		
	}
	
	// sets the traitName
	public void setTraitName (String traitName){
		this.traitName = traitName;		
	}
	
	// gets the traitName
	public String getTraitName (){
		return this.traitName;		
	}
	
	
	// Gets the Spinner
	public Spinner getSpinner(Activity act){
		if(s == null){
			s = new Spinner(act);
		}
		return s;
	}
	
	// Gets the TextView
	public TextView getTextViewQuestion (Activity act){
		if(t == null){
			t = new TextView(act);
		}
		return t;
}
	
	
}

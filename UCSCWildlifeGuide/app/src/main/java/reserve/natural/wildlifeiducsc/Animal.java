package reserve.natural.wildlifeiducsc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

import android.app.Activity;
import android.widget.Button;

public class Animal {

	// Fields
	private HashMap<String, ArrayList<String>> traitValue = new HashMap<String, ArrayList<String>>();
    // add button
    Button b = null;


	// Constructor
	public Animal(){
	}
	
	
	public Button getButton(Activity act){
		if(b == null){
			b = new Button(act);
		}
		return b;
	}
	
	
	public HashMap<String, ArrayList<String>> getHashMap(){
		return this.traitValue;
	}
	
	public Animal(String trait, ArrayList<String> traitArray){
		this.traitValue.put(trait, traitArray);
		//System.out.println("Animal object being made: " + trait + traitArray);
	}

	// Methods
	public ArrayList<String> get(String traitType){
		return (ArrayList<String>)this.traitValue.get(traitType);
	}
	

	// Adds a new key and new value for that key to the traitValue Hashmap
	public void addKeyAndValue(String key, String value){
		ArrayList<String> valueArray = new ArrayList<String>();
		valueArray.add(value);
		this.traitValue.put(key, valueArray);
		//System.out.println("Entry being put into A Animal object hashmap: " + key + ": " + value);
	}

	// Adds a new value to a key
	public void addNewValue(String key, String value){
		ArrayList<String> tempArray = (ArrayList<String>)this.traitValue.get(key);
		tempArray.add(value);
		this.traitValue.put(key, tempArray);
		//System.out.println("trait value being added to a trait of a Animal object hashmap: " + key + value);
	}
	
	// replaces the a value in a trait
	public void replaceValue(String key, String value){
		ArrayList<String> tempArray = new ArrayList<String>();
		tempArray.add(value);
		this.traitValue.put(key, tempArray);
	}
	
		
	// Matches Method
	public boolean matches(String userTraitName, String userValue){
		boolean match = false;
		if (userValue.equals(" ") || userValue.equals("Unknown")){
			match = true;
		} else {
			System.out.println("We are now inside the matches method it is currently");
			System.out.println("userTraitName: " + userTraitName);
			System.out.println("userValue: " + userValue);
	
			//gets the array list of the trait to examine of the mammal
			ArrayList<String> values = this.traitValue.get(userTraitName);
			System.out.println("this is the value of the trait for the real animal: " + values);
			for(int k = 0; k < values.size(); k++){
				if (values.get(k).contains(userValue) == true){
					match =  true;
				}
			}
		}
		return match;
	}
	
	
	public boolean matchesHM(Animal userAnimal){
		//System.out.println("MHM A inside MatchesHM");
		ArrayList<Boolean> traitsTrueFalse = new ArrayList<Boolean>();
		//System.out.println("This is the traits True False list (should grow): " + traitsTrueFalse);
		//System.out.println("this is the keyset? " + userAnimal.getHashMap().keySet());
		String[] userAnimalKeyTraits = userAnimal.getHashMap().keySet().toArray(new String[0]);
		//System.out.print("These are the user mammal traits we are looking at: ");
		for (int k = 0; k< userAnimalKeyTraits.length; k++){
			//System.out.print("|" + userAnimalKeyTraits[k] + "|");
		}

		//System.out.println("");
		//System.out.println("How main traits is it iterating though: " + userAnimal.getHashMap().size());
		for (int j = 0; j < userAnimal.getHashMap().size(); j++){ // iterates through traits in user animal
			//System.out.println("MHM A looking at: " + userAnimalKeyTraits[j]);
			boolean traitMatch = true;
			String traitToMatch = userAnimalKeyTraits[j];
			//System.out.println("this is the trait we are looking at: " + traitToMatch);
			String userTraitValue = userAnimal.getHashMap().get(traitToMatch).get(0);
			//System.out.println("this is the value of the userAnimal trait: " + userTraitValue);
			if (userTraitValue.contains("-") || userTraitValue.contains("Unknown")){
				traitMatch = true;
			} else {
				traitMatch = matches(traitToMatch, userTraitValue);
			}
			//System.out.println("The trait to match is: " + traitToMatch);
			traitsTrueFalse.add(traitMatch);
			//System.out.println("this is what the traits true false list is now" + traitsTrueFalse);
		}

		if (traitsTrueFalse.contains(false)){
			//System.out.println("MHM A returning false the usermammal does not match this animal");
			return false;
		} else {
			//System.out.println("MHM A returning true the usermammal does match this animal");
			return true;
		}
	}


	public boolean matchesHMM(Animal userAnimal){

		ArrayList<Boolean> traitsTrueFalse = new ArrayList<Boolean>();
		String[] userAnimalKeyTraits = userAnimal.getHashMap().keySet().toArray(new String[0]); // traits currently assigned to animal

		for (int j = 0; j < userAnimal.getHashMap().size(); j++){ // iterates through traits assigned to user animal
			boolean traitMatch = true;
			String traitToMatch = userAnimalKeyTraits[j];
			String userTraitValue = userAnimal.getHashMap().get(traitToMatch).get(0);
			if (userTraitValue.contains("-") || userTraitValue.contains("Unknown")){
				traitMatch = true;
			} else {
				traitMatch = matches(traitToMatch, userTraitValue);
			}
			traitsTrueFalse.add(traitMatch);
		}

		if (traitsTrueFalse.contains(false)){
			return false;
		} else {
			return true;
		}

	}


	// To String Method
	public void print(){
		//System.out.println("inside Animal Printer");
		String[] keys = new String[this.traitValue.size()];
		Object[] keysObject = (this.traitValue.keySet().toArray(keys));
		for( int p = 0; p < keys.length; p++){
			//System.out.println("Trait " + (String)keys[p] + ": "+ this.traitValue.get((String)keys[p]));
		}
	}
	
	
	public String getSummaryPointer(){
		String summaryPointer = this.traitValue.get("Summary").get(0);
		return summaryPointer;
	}
	
	public String getSummary(InputStream inputStream){
		String summary = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line = null;
		try {
			while((line = reader.readLine()) != null){
			    summary = summary + line;
			}
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		return summary;
	}

	
	

}

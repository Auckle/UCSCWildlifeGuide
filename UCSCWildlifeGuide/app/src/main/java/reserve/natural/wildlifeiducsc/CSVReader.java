package reserve.natural.wildlifeiducsc;

import java.util.*;
import java.io.*;


public class CSVReader {

	//Creates the main mammal HashMap
	HashMap<String, Animal> animalHashMap = new HashMap<String, Animal>(); 
	
	public CSVReader(InputStream inputStream) throws IOException {

		System.out.println("inside CSVReader");
		//Reads in a CSV file and splits it into lines
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		ArrayList<String[]> lines = new ArrayList<String[]>(); 
		String line = null;
		while((line = reader.readLine()) != null){
		    lines.add(line.split(",", -1));
		}
		//This translates the CSV file into a HashMap of Mammal names to HashMaps( of traits to values) 
		for(int j = 0; j < lines.size(); j++){
			String animalName = lines.get(j)[0];
			String traitType = lines.get(j)[1];
			String traitValue = lines.get(j)[2];
			if(animalHashMap.get(animalName) == null){		
				ArrayList<String> tempTraitArray = new ArrayList<String>();
				tempTraitArray.add(traitValue);
				animalHashMap.put(animalName, new Animal(traitType, tempTraitArray));
			} else {
				if(((Animal)animalHashMap.get(animalName)).get(traitType) == null){
					((Animal)animalHashMap.get(animalName)).addKeyAndValue(traitType, traitValue);
				} else {
					((Animal)animalHashMap.get(animalName)).addNewValue(traitType, traitValue);
				}
			}
		}
	}
	
	// returns the main HashMap
	public HashMap<String, Animal> getHashMap (){
		return this.animalHashMap;	
	}
	
	// returns the animals array
	public ArrayList<String> getAnimalsArray(){
		String[] animalArray = this.animalHashMap.keySet().toArray(new String[0]);
		ArrayList<String> animalList = new ArrayList<String>(animalArray.length);  
	    for (String s : animalArray) {  
	        animalList.add(s);  
	    }  
	    return animalList;
	}
	
	
	
}
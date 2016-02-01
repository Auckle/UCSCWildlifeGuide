package reserve.natural.wildlifeiducsc;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class ActivityGuide extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener, View.OnClickListener {

    protected ArrayList<String> possibleAnimals = null;
    protected HashMap<String, Animal> animalHashMap = null;
    protected HashMap<String, Integer> largeImageHashMap = null;
    protected HashMap<String, Question> mQuestionResponseHashMap = null;
    protected LinearLayout questionSpinners = null;
    protected LinearLayout animalButtons = null;
    protected HashMap<String, Integer> portraitImageHashMap = null;
    protected HashMap<String, Integer> landscapeImageHashMap = null;
    protected int screenWidth = 0;
    protected int screenHeight = 0;
    protected Animal userAnimal = new Animal();
    protected CSVReader animalHashMapMaker = null;
    protected HashMapMakerImages hashMapMakerImages = null;
    protected HashMapMakerQuestionResponse mQuestionResponseHashMapMaker = null;
    protected String[] mQuestions = null;
    protected int possibleAnimalInt = 0;
    protected TextView possibleAnimalTitle;
    protected String orientation = "portrait";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Find the screen width and height of the device
        Bundle extras = getIntent().getExtras();
        this.screenWidth = extras.getInt("screenWidth");
        this.screenHeight = extras.getInt("screenHeight");
        this.orientation = extras.getString("orientationMain");

        // Run the image hashMap makers
        hashMapMakerImages = new HashMapMakerImages();
        largeImageHashMap = hashMapMakerImages.getHashMap();

        // Set the portrait image hashMap
        portraitImageHashMap = hashMapMakerImages.getHashMapPortrait();

        // Set the landscape image hashMap
        landscapeImageHashMap = hashMapMakerImages.getHashMapLandscape();
    }


    // Called when the user clicks a animal summary button
    @Override
    public void onClick(View arg0) {

        try {

            Animal animalToOpen = null;
            String animalName = (String) ((Button) arg0).getText();

            System.out.println("this is the possibleAnimals: " + possibleAnimals);
            for(int j = 0; j <possibleAnimals.size(); j++){
                Animal animalToTest = this.animalHashMap.get(possibleAnimals.get(j));
                if (animalToTest.get("CommonName").get(0) == animalName){
                    animalToOpen = animalToTest;
                }
            }

            String summaryPointer = animalToOpen.getSummaryPointer();
            InputStream inputStream = getAssets().open(summaryPointer);
            String summary = animalToOpen.getSummary(inputStream);
            Intent intent = new Intent(this, ActivityAnimalSummary.class);
            intent.putExtra(android.content.Intent.EXTRA_TEXT, summary);

            // inserts matching large image in animal summary activity
            intent.putExtra("image_url", largeImageHashMap.get(animalName));

            startActivity(intent);

        } catch (IOException e) {
            System.out.println("DMKA OC error in try catch");
            e.printStackTrace();
        }

    }


    // Sets the questions and Spinners
    public void makeQuestionSpinners(String[] mammalQuestions){

        for (String mammalQuestion : mammalQuestions) {

            Question currentQuestion = this.mQuestionResponseHashMap.get(mammalQuestion);
            String currentQuestionString = mammalQuestion;
            String[] currentQuestionResponses = currentQuestion.getResponses();
            Spinner s = currentQuestion.getSpinner(this);
            s.setPadding(0, 0, 0, 15);
            s.setOnItemSelectedListener(this);

            TextView t = currentQuestion.getTextViewQuestion(this);
            t.setPadding(0, 10, 5, 5);
            t.setText(currentQuestionString);
            this.questionSpinners.addView(t);


            ArrayAdapter<String> spinnerArrayAdapter =
                    new ArrayAdapter<String>(
                            this, android.R.layout.simple_spinner_item, currentQuestionResponses);
            spinnerArrayAdapter.setDropDownViewResource(
                    android.R.layout.simple_spinner_dropdown_item); // Not sure what is happening here
            s.setAdapter(spinnerArrayAdapter);
            this.questionSpinners.addView(s);

        }
    }

    // Removes possible animal buttons
    public void removeAnimalButtons(){
        for(int j = 0; j <possibleAnimals.size(); j++){
            Button b = this.animalHashMap.get(possibleAnimals.get(j)).getButton(this);
            this.animalButtons.removeView(b);
        }
    }

    // Adds possible animal buttons
    public void makeAnimalButtons(ArrayList<String> possibleAnimals) {
        for (int j = 0; j < possibleAnimals.size(); j++) {

            Animal currentAnimal = this.animalHashMap.get(possibleAnimals.get(j));
            String currentAnimalString = possibleAnimals.get(j);
            HashMap<String, ArrayList<String>> currentAnimalTraitValueHashMap =
                    this.animalHashMap.get(currentAnimalString).getHashMap();
            String currentAnimalStringCommonName =
                    currentAnimalTraitValueHashMap.get("CommonName").get(0);
            Button b = currentAnimal.getButton(this);
            b.setText(currentAnimal.get("CommonName").get(0));

            // Button images are labels (AnimalName)_small they are 230 pixels wide and are cropped to the animal
            Drawable image;

            image = ContextCompat.getDrawable(this,
                    portraitImageHashMap.get(currentAnimalStringCommonName));
            // TODO
         /*   if (this.orientation.equals("portrait")){
                image = ContextCompat.getDrawable(this, portraitImageHashMap.get(currentAnimalStringCommonName));
            }
            else {
                image = ContextCompat.getDrawable(this, landscapeImageHashMap.get(currentAnimalStringCommonName));
            }*/

            int height;
            int width;
            if (image.getIntrinsicWidth() < screenWidth) {
                width = image.getIntrinsicWidth();
                height = image.getIntrinsicHeight();
            } else {
                width = screenWidth;
                height = ((image.getIntrinsicHeight() *
                        (this.screenWidth)) / image.getIntrinsicWidth());
            }

            image.setBounds(0, 0, width, height);
            b.setCompoundDrawables(null, image, null, null);
            b.setPadding(15, 15, 15, 15);

            b.setOnClickListener(this);

            this.animalButtons.addView(b);

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // Auto-generated method stub
    }


    // Returns a list of possible animals given the current user animal
    public ArrayList<String> makePossibleAnimalList (HashMap<String, Animal> animalHashMap,
                                                     Animal userMammal ){
        String[] animals = animalHashMap.keySet().toArray(new String[0]);
        ArrayList<String> possibleAnimals = new ArrayList<String>();
        Collections.addAll(possibleAnimals, animals);
        boolean match;
        for (String animal : animals) {
            match = animalHashMap.get(animal).matchesHM(userMammal);
            if (!match) {
                possibleAnimals.remove(animal);
            }
        }
        return possibleAnimals;
    }


    /* Called when the user clicks the Clear button */
    public void clearForm (View view) {

        for (int j = 0; j < mQuestions.length; j++){
            Question currentQuestion = this.mQuestionResponseHashMap.get(mQuestions[j]);
            Spinner s = currentQuestion.getSpinner(this);
            s.setSelection(0);
        }

        possibleAnimalTitle.setText(R.string.possible_animal_title_several);
        this.possibleAnimals = animalHashMapMaker.getAnimalsArray();
        this.possibleAnimalInt = this.possibleAnimals.size();
        removeAnimalButtons();
        makeAnimalButtons(possibleAnimals);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.d("TAG", "AM I CALLED?");

        // Checks the orientation of the screen for landscape and portrait
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            orientation = "landscape";
            removeAnimalButtons();
            makeAnimalButtons(possibleAnimals);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            orientation = "portrait";
            removeAnimalButtons();
            makeAnimalButtons(possibleAnimals);
        }
    }


    // LISTENER METHODS This is called when an entry is selected in a spinner
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

        String userTraitName = " ";
        Spinner eventSpinner = (Spinner)arg0;

        // Find the trait name associated with the selected spinner
        for (String mQuestion : mQuestions) {
            Question currentQuestion = this.mQuestionResponseHashMap.get(mQuestion);
            if (eventSpinner == currentQuestion.getSpinner(this)) {
                userTraitName = currentQuestion.getTraitName();
            }
        }

        // Find get the values associated with spinner
        String userValue = arg0.getItemAtPosition(arg2).toString();

        // Set the trait of the spinner of the user animal with the selected value
        this.userAnimal.replaceValue(userTraitName, userValue);

        removeAnimalButtons();
        possibleAnimals = makePossibleAnimalList(this.animalHashMap, userAnimal);
        this.possibleAnimalInt = this.possibleAnimals.size();
        if (possibleAnimalInt == 0) {
            possibleAnimalTitle.setText(R.string.R_string_possible_animal_title_none);
        } else if (possibleAnimalInt ==1) {
            possibleAnimalTitle.setText(R.string.R_string_possible_animal_title_one);
            makeAnimalButtons(possibleAnimals);
        } else {
            possibleAnimalTitle.setText(R.string.possible_animal_title_several);
            String resultMessage = "";
            for(int j = 0; j<possibleAnimalInt; j++){
                resultMessage = resultMessage + possibleAnimals.get(j) + "\n";
            }
            makeAnimalButtons(possibleAnimals);
        }

    }


    protected void setUpActivity(String csvFile, String[][] questionResponses,
                                 String[] questions, String[] traits ){

        // Find and set the possibleAnimalTitle to its starting position
        possibleAnimalTitle = (TextView)findViewById(R.id.possibleanimaltitle);
        possibleAnimalTitle.setText(R.string.possible_animal_title_several);

        try {

            // Read in mammal.csv and create all HashMaps
            InputStream inputStream = getAssets().open(csvFile);
            animalHashMapMaker = new CSVReader(inputStream);
            animalHashMap = animalHashMapMaker.getHashMap();

            mQuestionResponseHashMapMaker = new HashMapMakerQuestionResponse(questions,
                    questionResponses,traits);

            mQuestionResponseHashMap = mQuestionResponseHashMapMaker.getHashMap();

            mQuestions = mQuestionResponseHashMapMaker.getQuestions();

            this.possibleAnimals = animalHashMapMaker.getAnimalsArray();
            this.possibleAnimalInt = this.possibleAnimals.size();

            // Find the appropriate layout to add buttons to and add appropriate buttons
            this.animalButtons = (LinearLayout)findViewById(R.id.linearlayoutright);
            makeAnimalButtons(possibleAnimals);

            this.questionSpinners = (LinearLayout)findViewById(R.id.linearlayoutleft);
            makeQuestionSpinners(mQuestions);


        } catch (IOException e) {
            //Auto-generated catch block
            e.printStackTrace();
        }
    }


}

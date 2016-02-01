package reserve.natural.wildlifeiducsc;

import android.util.Log;

import java.util.HashMap;

public class HashMapMakerQuestionResponse {

    //Fields
    HashMap<String, Question> mQuestionResponseHashMap = new HashMap<String, Question>();
    String[] mQuestions = null;

    // Creates a hashMap of key questions and possible responses
    public HashMapMakerQuestionResponse(String[] questions, String[][] responses, String[] traitNames){

        // TODO Check that array sizes are the same
        Log.d("TAG", "Lengths" + questions.length +", " + responses.length + ", " + traitNames.length );

        if (questions.length != responses.length
                || questions.length != traitNames.length) {
            throw new IllegalStateException("questions, responses, and trait names arrays are not the same length");
        }

        mQuestions = questions;

        for (int x = 0; x< questions.length; x++){
            mQuestionResponseHashMap.put(questions[x], new Question(questions[x], responses[x], traitNames[x] ));
        }

    }

    // returns the main HashMap
    public HashMap<String, Question> getHashMap (){
        return this.mQuestionResponseHashMap;
    }

    // returns the a String[] of the questions
    public String[] getQuestions (){
        return this.mQuestions;
    }

}




package reserve.natural.wildlifeiducsc;

import android.os.Bundle;

public class ActivityDisplayMammalKey extends ActivityGuide {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        String[][] questionResponses = {
                getResources().getStringArray(R.array.mammal_sizeResponses),
                getResources().getStringArray(R.array.mammal_group),
                getResources().getStringArray(R.array.mammal_tailLength),
                getResources().getStringArray(R.array.mammal_furYesNo),
                getResources().getStringArray(R.array.mammal_tailColor),
                getResources().getStringArray(R.array.mammal_tailPattern),
                getResources().getStringArray(R.array.mammal_backColor),
                getResources().getStringArray(R.array.mammal_backPattern),
                getResources().getStringArray(R.array.mammal_stomachColor),
                getResources().getStringArray(R.array.mammal_backToes),
                getResources().getStringArray(R.array.mammal_frontToes),
        };

        setUpActivity("MammalSheet4.jpg", questionResponses,
                getResources().getStringArray(R.array.mammal_questions),
                getResources().getStringArray(R.array.mammal_trait_names));
    }


}

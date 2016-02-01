package reserve.natural.wildlifeiducsc;

import android.os.Bundle;

public class ActivityDisplayReptileKey extends ActivityGuide {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_key);

		String[][] questionResponses = {
				getResources().getStringArray(R.array.reptile_legResponses),
				getResources().getStringArray(R.array.reptile_dorsalColor),
				getResources().getStringArray(R.array.reptile_dorsalPattern),
				getResources().getStringArray(R.array.reptile_ventralColor),
				getResources().getStringArray(R.array.reptile_contrastLine),
				getResources().getStringArray(R.array.reptile_legPattern),
				getResources().getStringArray(R.array.reptile_scales),
				getResources().getStringArray(R.array.reptile_bodyShape),
				getResources().getStringArray(R.array.reptile_eyeColor),
				getResources().getStringArray(R.array.reptile_head),
		};

		setUpActivity("ReptileSheet.jpg", questionResponses,
				getResources().getStringArray(R.array.reptile_listOfQuestions),
				getResources().getStringArray(R.array.reptile_traits));
	}
	
}
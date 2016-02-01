package reserve.natural.wildlifeiducsc;

import android.os.Bundle;

public class ActivityDisplayAmphibianKey extends ActivityGuide {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_key);

		String[][] questionResponses = {
				getResources().getStringArray(R.array.amphibian_habitResponses),
				getResources().getStringArray(R.array.amphibian_tailResponses),
				getResources().getStringArray(R.array.amphibian_backColorResponses),
				getResources().getStringArray(R.array.amphibian_backPatternResponses),
				getResources().getStringArray(R.array.amphibian_stomachPatternResponses),
				getResources().getStringArray(R.array.amphibian_skinResponses),
				getResources().getStringArray(R.array.amphibian_contrastResponses),
				getResources().getStringArray(R.array.amphibian_stripeResponses),
				getResources().getStringArray(R.array.amphibian_eyeResponses),
				getResources().getStringArray(R.array.amphibian_legResponses),
				getResources().getStringArray(R.array.amphibian_limbSizeResponses),
                getResources().getStringArray(R.array.amphibian_backToeResponses),
                getResources().getStringArray(R.array.amphibian_costalGrooveResponses),
                getResources().getStringArray(R.array.amphibian_toePadResponses),
                getResources().getStringArray(R.array.amphibian_dLFResponses),
                getResources().getStringArray(R.array.amphibian_foldResponses),
                getResources().getStringArray(R.array.amphibian_glandResponses),
		};

		setUpActivity("amphibianSheet3.jpg", questionResponses,
				getResources().getStringArray(R.array.amphibian_listOfQuestions),
				getResources().getStringArray(R.array.amphibian_trait_names));
	}

}


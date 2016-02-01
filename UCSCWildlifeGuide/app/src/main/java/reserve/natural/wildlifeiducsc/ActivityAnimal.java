package reserve.natural.wildlifeiducsc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;


public class ActivityAnimal extends AppCompatActivity implements View.OnClickListener {

	private int screenWidth = 0;
	private int screenHeight = 0;
	private LinearLayout mainLayout = null;
	private String orientation = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TAG", "Animal activity opened");
		setContentView(R.layout.activity_animal);
        this.mainLayout = (LinearLayout)findViewById(R.id.keyButtons);

        findViewById(R.id.mammalButton).setOnClickListener(this);
        findViewById(R.id.amphibianButton).setOnClickListener(this);
        findViewById(R.id.reptileButton).setOnClickListener(this);

        Intent mIntent = getIntent();
        screenWidth = mIntent.getIntExtra("width", 0);
        screenHeight = mIntent.getIntExtra("height", 0);
	}



    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.mammalButton:
                openMammalKey(v);
                break;
            case R.id.amphibianButton:
                openAmphibianKey(v);
                break;
            case R.id.reptileButton:
                openReptileKey(v);
                break;
        }
    }
	
	/** Called when the user clicks the Mammal Key button */
	public void openMammalKey (View view) {
        screenWidth  = (((mainLayout.getMeasuredWidth())/3) -80); 
        screenHeight = (((mainLayout.getMeasuredHeight())/3) -80);
		Intent intent = new Intent(this, ActivityDisplayMammalKey.class);
		intent.putExtra("screenWidth", screenWidth);
		intent.putExtra("screenHeight", screenHeight);
		intent.putExtra("orientationMain", orientation);
		startActivity(intent);
	    // Open Mammal Key in response to button
	}
	
	/** Called when the user clicks the Amphibian Key button */
	public void openAmphibianKey (View view) {
        screenWidth  = (((mainLayout.getMeasuredWidth())/3) -80); 
        screenHeight = (((mainLayout.getMeasuredHeight())/3) + 80);  
		Intent intent = new Intent(this, ActivityDisplayAmphibianKey.class);
		intent.putExtra("screenWidth", screenWidth);
		intent.putExtra("screenHeight", screenHeight);
		intent.putExtra("orientationMain", orientation);
		startActivity(intent);
	    // Open Amphibian Key in response to button
	}
	
	/** Called when the user clicks the Reptile Key button */
	public void openReptileKey (View view) {
        screenWidth  = (((mainLayout.getMeasuredWidth())/3) -80); 
        screenHeight = (((mainLayout.getMeasuredHeight())/3) -80);  
		Intent intent = new Intent(this, ActivityDisplayReptileKey.class);
		intent.putExtra("screenWidth", screenWidth);
		intent.putExtra("screenHeight", screenHeight);
		intent.putExtra("orientationMain", orientation);
		startActivity(intent);
	    // Open Reptile Key in response to button
	}

}

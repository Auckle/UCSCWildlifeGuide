package reserve.natural.wildlifeiducsc;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;


public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

	private int screenWidth = 0;
	private int screenHeight = 0;
	private LinearLayout mainLayout = null;
	private String orientation = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        this.mainLayout = (LinearLayout)findViewById(R.id.keyButtons);
        mainLayout.getViewTreeObserver().addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        mainLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        screenWidth = mainLayout.getMeasuredWidth();
                        screenHeight = mainLayout.getMeasuredHeight();
                        System.out.println("*********this is screen width of the splash screen: " + screenWidth);
                        System.out.println("*********this is screen height of the splash screen: " + screenHeight);
                    }
                });

        // Bind the buttons in the layout file to listen for clicks
		findViewById(R.id.animalButton).setOnClickListener(this);
		findViewById(R.id.plantButton).setOnClickListener(this);
		findViewById(R.id.infoButton).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
			case R.id.animalButton:
				openAnimalKey(v);
                break;
			case R.id.plantButton:
				openPlantKey(v);
                break;
			case R.id.infoButton:
				openInfoPage(v);
                break;
		}
	}

	
	/** Called when the user clicks the Animal Key button */
	public void openAnimalKey (View view) {
        Log.d("TAG", "opening animal key");
        screenWidth  = (((mainLayout.getMeasuredWidth())/3) -80); 
        screenHeight = (((mainLayout.getMeasuredHeight())/3) -80);
		Intent intent = new Intent(this, ActivityAnimal.class);
		intent.putExtra("screenWidth", screenWidth);
		intent.putExtra("screenHeight", screenHeight);
		intent.putExtra("orientationMain", orientation);
		startActivity(intent);
	    // Open Animal Activity in response to button
	}
	
	/** Called when the user clicks the Plant Key button */
	public void openPlantKey (View view) {
        Log.d("TAG", "opening plant key");
        screenWidth  = (((mainLayout.getMeasuredWidth())/3) -80); 
        screenHeight = (((mainLayout.getMeasuredHeight())/3) + 80);  
		Intent intent = new Intent(this, ActivityPlant.class);
		intent.putExtra("screenWidth", screenWidth);
		intent.putExtra("screenHeight", screenHeight);
		intent.putExtra("orientationMain", orientation);
		startActivity(intent);
	    // Open Plant Activity in response to button
	}

	
	/** Called when the user clicks the Information button */
	public void openInfoPage (View view) {
        Log.d("TAG", "opening info key");
		Intent intent = new Intent(this, ActivityAppInformation.class);
		startActivity(intent);
		// Open Info page in response to button
	}


}

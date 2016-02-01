package reserve.natural.wildlifeiducsc;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.Html;
import android.text.method.LinkMovementMethod;


public class ActivityAnimalSummary extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_summary);

        TextView message = (TextView) findViewById(R.id.input);
        ImageView image = (ImageView) findViewById(R.id.inputImage);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        // Get the html text from the intent
        String value1 = extras.getString(Intent.EXTRA_TEXT);

        if (value1 != null) {
            // Do something with the data
            message.setText(Html.fromHtml(value1));
            message.setMovementMethod(LinkMovementMethod.getInstance());
        }

        // Get the image pointer from the intent
        int image_link = extras.getInt("image_url");

        // Set animal image
        image.setImageResource(image_link);
        message.setText(Html.fromHtml(value1));
        message.setMovementMethod(LinkMovementMethod.getInstance());


    }

}

package derrick.ward.androidhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Event Handler for Saving Message
    */
    public void SaveMessage(View view) {
        EditText enteredMessage = findViewById(R.id.enterMessage);
        TextView textView = findViewById(R.id.textView);

        // Set textView to show the entered message
        if (enteredMessage != null && textView != null) {
            textView.setText(enteredMessage.getText());
        }
    }
}
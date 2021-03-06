package desk713.hackathon.findersandkeepers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AskDetails extends AppCompatActivity {
    ImageButton buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_details);

        initUI();

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startListItems = new Intent(getApplicationContext(), ListItems.class);
                startActivity(startListItems);
            }
        });
    }

    private void initUI(){
        buttonNext = (ImageButton)findViewById(R.id.buttonNext);
    }
}

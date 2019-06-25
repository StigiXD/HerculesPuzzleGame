package stagakis.com.herculesgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        configureLevelOneButton();
    }

    //level one play button
    public void configureLevelOneButton(){
        Button levelOneButton = (Button) findViewById(R.id.level_one_button);
        levelOneButton.setAlpha(0);
        levelOneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"You pressed the first level.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Levels.this, PuzzleGame.class));
            }
        });
    }
}

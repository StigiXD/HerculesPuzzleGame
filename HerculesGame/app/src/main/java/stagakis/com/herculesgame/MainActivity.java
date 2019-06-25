package stagakis.com.herculesgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurePlayButton();
    }

    //home screen menu to proceed to puzzle levels (PLAY button onClick)
    public void configurePlayButton(){
        //setting the image of the the play button to be transparent
        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setAlpha(0);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"You pressed the play button.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Levels.class));
            }
        });
    }


}

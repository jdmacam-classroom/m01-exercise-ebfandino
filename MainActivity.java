package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView v = (TextView) findViewById(R.id.txtView2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void setText(View v) {



        if (count == 0){
            txtView2.setText("Giraffes are more likely to be struck by lightning than humans due to their height.");
        }else if(count == 1){
            txtView2.setText("Peanuts are not nuts; they are legumes that grow underground.");
        }else if(count == 2){
            txtView2.setText("There's a company in Japan that has schools that teach you how to be funny.");
        }else if(count == 3){
            txtView2.setText("Kangaroos can't walk backwards");
        }else if(count == 4){
            txtView2.setText("Grasshopper's ears are located on it's belly, not its head.");
        }else if(count == 5) {
            txtView2.setText("Bears don't urinate when hibernation.");
        } else if (count == 6) {
            txtView2.setText("A group of lizards are called lounge.");
        }else if(count == 7) {
            txtView2.setText("The word porcupine means spiny pig.");
        }else if(count == 8) {
            txtView2.setText(" The praying mantis is the only insect that can turn its head");
        }else if(count == 9){
                txtView2.setText("The space between your eyebrows is called the glabella");
    }
count++;

    if(count == 10){
        count =0;
    }
}
}
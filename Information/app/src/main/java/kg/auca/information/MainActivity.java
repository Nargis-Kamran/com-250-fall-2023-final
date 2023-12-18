package kg.auca.information;


import static kg.auca.information.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDateAndTime;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        textViewDateAndTime =  findViewById(layout.activity_main);

        Button buttonDateAndTime = findViewById(id.buttonDateAndTime);
        buttonDateAndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDateAndTime();
            }
        });

    }

    private void displayDateAndTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM dd/MM/yyyy"), getDefuakt());
        String currentDate  =  dateFormat.format(new Date());

        textViewDateAndTime.setText(currentDate);
    }
}
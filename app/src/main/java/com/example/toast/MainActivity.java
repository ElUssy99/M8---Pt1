package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context con = getApplicationContext();
                CharSequence text = "Holita vecinito";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(con, text, duration);
                toast.show();
            }
        });
    }
}

package com.example.firebasecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

        private EditText text;
        private Button button;
        FirebaseDatabase rootNode;
        DatabaseReference reference;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        rootNode = FirebaseDatabase.getInstance();
                        reference = rootNode.getReference("data");
                        reference.setValue("First data");
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "click",
                                Toast.LENGTH_SHORT);

                        toast.show();
                }
        });

        }
        }
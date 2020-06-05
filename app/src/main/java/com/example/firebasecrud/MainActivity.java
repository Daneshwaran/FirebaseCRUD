package com.example.firebasecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

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
                        String txt_name = text.getText().toString();
                        FirebaseDatabase.getInstance().getReference().child("knowledge").push().child("Name").setValue(txt_name);
                }
        });

        }
        }
package com.example.firebasecrud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

        private EditText title,description,author;
        private Button save;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                title = findViewById(R.id.title);
                description = findViewById(R.id.description);
                author = findViewById(R.id.author);
                save = findViewById(R.id.save);

                save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                                HashMap<String,Object> map = new HashMap<>();
                                map.put("title",title.getText().toString());
                                map.put("description",description.getText().toString());
                                map.put("author",author.getText().toString());

                                FirebaseDatabase.getInstance().getReference().child("Post").push()
                                        .setValue(map);
                }
        });

        }
        }
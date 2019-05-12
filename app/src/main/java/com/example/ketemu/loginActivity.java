package com.example.ketemu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.firebase.database.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference user;

    EditText editEmail, editPassword;
    Button btnSignin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        database = FirebaseDatabase.getInstance();
        user = database.getReference("user");

        editEmail = (EditText) findViewById(R.id.emailLogin);
        editPassword = (EditText) findViewById(R.id.passLogin);

        btnSignin = (Button) findViewById(R.id.btnlogin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn(editEmail.getText().toString(),
                        editPassword.getText().toString());
            }
        });


    }

    private void SignIn(final String email, final String password) {
        user.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(email).exists()){
                    if(!email.isEmpty()){
                        user login = dataSnapshot.child(email).getValue(user.getClass());
                        if(login.g)
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}

package com.example.login_taller;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText usu;
    private EditText pas;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = (EditText)findViewById(R.id.texnam);
        pas = (EditText)findViewById(R.id.texpas);
        btn = (Button)findViewById(R.id.btn_ing);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(usu.getText().toString(), pas.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){
        if((userName.equals("admin")) && (userPassword.equals("123"))){
            Intent intent = new Intent(MainActivity.this,menu.class);

            startActivity(intent);
        }

    }
}

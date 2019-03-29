package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class page2 extends AppCompatActivity {
    private TextView usersname;
    private TextView passsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

    }
    public void btn2_click(View view){
        usersname=findViewById(R.id.un);
        passsw=findViewById(R.id.pw);
        String st1=usersname.getText().toString().trim();
        String st2=passsw.getText().toString().trim();
        Toast.makeText(this,"usersname:"+st1+" password:"+st2,Toast.LENGTH_LONG).show();
    }
}
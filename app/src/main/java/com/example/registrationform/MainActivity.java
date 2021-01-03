package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       TextView result;
       EditText name;
       EditText phoneNumber;
       EditText Email;
       EditText fatherName;
       EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view) {
            name=(EditText)findViewById(R.id.editTextTextPersonName);
            String nameStr=" Name : "+ valueCheck(name.getText().toString());
            phoneNumber=(EditText)findViewById(R.id.editTextPhone);
            String phoneNumberStr=" Phone Number : "+valueCheck(phoneNumber.getText().toString());
            Email=(EditText)findViewById(R.id.editTextTextEmailAddress);
            String emailStr=" Email : "+valueCheck(Email.getText().toString());
            fatherName=(EditText)findViewById(R.id.editTextTextPersonName2);
            String fatherStr=" Father Name : "+valueCheck(fatherName.getText().toString());
            userName=(EditText)findViewById(R.id.editTextTextPersonName3);
            String userNameStr=" User Name : "+valueCheck(userName.getText().toString());
            result=(TextView)findViewById(R.id.res);
            result.setText("Info : "+ nameStr+"\n"+ fatherStr +"\n"+ emailStr+"\n"+ phoneNumberStr+"\n"+ userNameStr);

    }
    public  String  valueCheck(String val){
        return val.equals("")?"No value":val;
    }
}
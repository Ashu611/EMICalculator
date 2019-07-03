package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2,edt3;
    TextView edt4,edt5;
    Button emical;
    Double s1,s2;
    int s3;
    double si,a,emi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.editText);
        edt2=(EditText)findViewById(R.id.editText2);
        edt3=(EditText)findViewById(R.id.editText3);
        edt4=(TextView)findViewById(R.id.textView10);
        edt5=(TextView)findViewById(R.id.textView11);

        emical=(Button)findViewById(R.id.button);
        emical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = Double.parseDouble(edt1.getText().toString());
                s2 = Double.parseDouble(edt2.getText().toString());
                s3 = Integer.parseInt(edt3.getText().toString());

                    a = s1 / s3;
                    si = (s1 * s2 * s3) / (12 * 100);
                    emi = a + si;

                edt4.setText(String.valueOf(emi));
                edt5.setText(String.valueOf(si*s3));
            }
        });
    }
}

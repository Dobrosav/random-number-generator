package com.dobrosav.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt;
    private CheckBox writeCheckBox;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.randomButton);
        txt = findViewById(R.id.numberText);
        writeCheckBox=findViewById(R.id.writeCheckbox);
        txtResult=findViewById(R.id.txtResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(System.currentTimeMillis());
                int generatedNumber = random.nextInt(40);
                txt.setText(generatedNumber+"");
                if (writeCheckBox.isChecked()){
                   if (txtResult.getText().length()==0){
                       txtResult.setText(generatedNumber+"");
                   }
                   else {
                       txtResult.setText(txtResult.getText()+","+generatedNumber);
                   }
                }
            }
        });
    }
}
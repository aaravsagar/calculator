package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resultText;
    double num1, num2;
    boolean isAddition, isSubtraction, isMultiplication, isDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText2);
        resultText = findViewById(R.id.resultText);

        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button equal = findViewById(R.id.submit);
        Button clear = findViewById(R.id.clear_text);

        add.setOnClickListener(v -> {
            num1 = Double.parseDouble(editText.getText().toString());
            isAddition = true;
            editText.setText("");
        });

        sub.setOnClickListener(v -> {
            num1 = Double.parseDouble(editText.getText().toString());
            isSubtraction = true;
            editText.setText("");
        });

        mul.setOnClickListener(v -> {
            num1 = Double.parseDouble(editText.getText().toString());
            isMultiplication = true;
            editText.setText("");
        });

        div.setOnClickListener(v -> {
            num1 = Double.parseDouble(editText.getText().toString());
            isDivision = true;
            editText.setText("");
        });

        equal.setOnClickListener(v -> {
            num2 = Double.parseDouble(editText.getText().toString());
            double result = 0;

            if(isAddition) result = num1 + num2;
            if(isSubtraction) result = num1 - num2;
            if(isMultiplication) result = num1 * num2;
            if(isDivision) result = num1 / num2;

            resultText.setText(String.valueOf(result));
            editText.setText(String.valueOf(result));
        });

        clear.setOnClickListener(v -> {
            editText.setText("");
            resultText.setText("0");
        });
    }
}
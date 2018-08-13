package com.example.asus.studentsgradewithclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button evaluate = findViewById(R.id.bt_evaluate);
        evaluate.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.bt_evaluate){
            EditText nameEditText = findViewById(R.id.et_name);
            EditText addressEditText = findViewById(R.id.et_address);
            EditText gradeEditText = findViewById(R.id.et_grade);

            Students student = new Students();
            student.setName(nameEditText.getText().toString());
            student.setAddress(addressEditText.getText().toString());
            student.setGrade(Integer.parseInt(gradeEditText.getText().toString()));

            TextView evaluationTextView = findViewById(R.id.tv_evaluation);
            evaluationTextView.append(student.getevaluation());
        }
    }
}

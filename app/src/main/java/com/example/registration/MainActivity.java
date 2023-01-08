package com.example.registration;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private RadioGroup rdGroup;
    private Switch swLastYear;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        edtName = findViewById(R.id.edtName);
        rdGroup = findViewById(R.id.rdGroup);
        swLastYear = findViewById(R.id.swLastYear);
        txtResult = findViewById(R.id.txtResult);
    }

    public void btnSave_Click(View view) {
        String msg = "";
        String name = edtName.getText().toString();
        if(!name.isEmpty()){
            msg = name;
        }
        if(swLastYear.isChecked()){
            msg+=", \n" + swLastYear.getText().toString();
        }
        int id = rdGroup.getCheckedRadioButtonId();
        if(id!=-1) {
            RadioButton rd = findViewById(id);
            msg+=", \n" + rd.getText().toString();
        }
        txtResult.setText(msg);

    }
}
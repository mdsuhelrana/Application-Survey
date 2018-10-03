package com.example.mdsuhelrana.surveyproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.mdsuhelrana.surveyproject.data.BasicInfo;
import com.example.mdsuhelrana.surveyproject.question.App1qsnActivity;

public class BasicInfoActivity extends AppCompatActivity {
    private RadioButton male,female;
    private RadioButton age1,age2,age3,age4;
    private RadioButton edulevel1,edulevel2,edulevel3,edulevel4;

    private String gender=null,age=null,edulevel=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        initialize();

    }


    public void selectgender(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.male_id){
            if (rb.isChecked()){
                gender=rb.getText().toString();
            }

        }else if (id==R.id.female_id){
            if (rb.isChecked()){
                gender=rb.getText().toString();
            }
        }
    }

    public void selectage(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.age1_id){
            if (rb.isChecked()){
                age=rb.getText().toString();
            }

        }else if (id==R.id.age2_id){
            if (rb.isChecked()){
                age=rb.getText().toString();
            }

        }else if (id==R.id.age3_id){
            if (rb.isChecked()){
                age=rb.getText().toString();
            }

        }else if (id==R.id.age4_id) {
            if (rb.isChecked()){
                age=rb.getText().toString();
            }
        }
    }

    public void selectedulevel(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.edulevel1_id){
            if (rb.isChecked()){
                edulevel=rb.getText().toString();
            }

        }else if (id==R.id.edulevel2_id){
            if (rb.isChecked()){
                edulevel=rb.getText().toString();
            }

        }else if (id==R.id.edulevel3_id){
            if (rb.isChecked()){
                edulevel=rb.getText().toString();
            }

        }else if (id==R.id.edulevel4_id) {
            if (rb.isChecked()){
                edulevel=rb.getText().toString();
            }
        }
    }


    public void startToQsn(View view) {
        if (age == null) {
            Toast.makeText(this, "age is unselected", Toast.LENGTH_SHORT).show();
        } else if (gender == null) {
            Toast.makeText(this, "gender is unselected", Toast.LENGTH_SHORT).show();
        } else if (edulevel == null) {
            Toast.makeText(this, "education level is unselected", Toast.LENGTH_SHORT).show();
        } else {
            BasicInfo basicInfo = new BasicInfo(gender, age, edulevel);
            startActivity(new Intent(BasicInfoActivity.this, App1qsnActivity.class)
                    .putExtra("basicinfo", basicInfo));
        }
    }

    private void initialize() {
        male=findViewById(R.id.male_id);
        female=findViewById(R.id.female_id);

        age1=findViewById(R.id.age1_id);
        age2=findViewById(R.id.age2_id);
        age3=findViewById(R.id.age3_id);
        age4=findViewById(R.id.age4_id);

        edulevel1=findViewById(R.id.edulevel1_id);
        edulevel2=findViewById(R.id.edulevel2_id);
        edulevel3=findViewById(R.id.edulevel3_id);
        edulevel4=findViewById(R.id.edulevel4_id);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(BasicInfoActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}

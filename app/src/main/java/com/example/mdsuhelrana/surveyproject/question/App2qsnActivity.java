package com.example.mdsuhelrana.surveyproject.question;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mdsuhelrana.surveyproject.R;
import com.example.mdsuhelrana.surveyproject.data.App1;
import com.example.mdsuhelrana.surveyproject.data.App2;
import com.example.mdsuhelrana.surveyproject.data.BasicInfo;

public class App2qsnActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNext;
    private TextView tvApp;

    private RadioButton qsn1_selected1,qsn1_selected2,qsn1_selected3,qsn1_selected4,qsn1_selected5;
    private RadioButton qsn2_selected1,qsn2_selected2,qsn2_selected3,qsn2_selected4,qsn2_selected5;
    private RadioButton qsn3_selected1,qsn3_selected2,qsn3_selected3,qsn3_selected4,qsn3_selected5;
    private RadioButton qsn4_selected1,qsn4_selected2,qsn4_selected3,qsn4_selected4,qsn4_selected5;
    private RadioButton qsn5_selected1,qsn5_selected2,qsn5_selected3,qsn5_selected4,qsn5_selected5;
    private RadioButton qsn6_selected1,qsn6_selected2,qsn6_selected3,qsn6_selected4,qsn6_selected5;
    private RadioButton qsn7_selected1,qsn7_selected2,qsn7_selected3,qsn7_selected4,qsn7_selected5;
    private RadioButton qsn8_selected1,qsn8_selected2,qsn8_selected3,qsn8_selected4,qsn8_selected5;
    private RadioButton qsn9_selected1,qsn9_selected2,qsn9_selected3,qsn9_selected4,qsn9_selected5;
    private RadioButton qsn10_selected1,qsn10_selected2,qsn10_selected3,qsn10_selected4,qsn10_selected5;

    private String answer1=null,answer2=null,answer3=null,answer4=null,answer5=null,
            answer6=null,answer7=null,answer8=null,answer9=null,answer10=null;

    private  App1 app1;
    private BasicInfo basicInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        app1= (App1) getIntent().getSerializableExtra("app1");
        basicInfo= (BasicInfo) getIntent().getSerializableExtra("basicinfo");
        initializtion();
        tvApp.setText("2.BD Tour");
        btnNext.setOnClickListener(this);
    }

    public void selecetanser1(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn1_strong_disagree_Id){
            if (rb.isChecked()){
                answer1="1";
            }

        }else if (id==R.id.qsn1_disagree_Id){
            if (rb.isChecked()){
                answer1="2";
            }

        }else if (id==R.id.qsn1_neutral_Id){
            if (rb.isChecked()){
                answer1="3";
            }

        }else if (id==R.id.qsn1_agree_Id) {
            if (rb.isChecked()){
                answer1="4";
            }
        }else if (id==R.id.qsn1_strong_agree_Id) {
            if (rb.isChecked()){
                answer1="5";
            }
        }
    }
    public void selecetanser2(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn2_strong_disagree_Id){
            if (rb.isChecked()){
                answer2="1";
            }

        }else if (id==R.id.qsn2_disagree_Id){
            if (rb.isChecked()){
                answer2="2";
            }

        }else if (id==R.id.qsn2_neutral_Id){
            if (rb.isChecked()){
                answer2="3";
            }

        }else if (id==R.id.qsn2_agree_Id) {
            if (rb.isChecked()){
                answer2="4";
            }
        }else if (id==R.id.qsn2_strong_agree_Id) {
            if (rb.isChecked()){
                answer2="5";
            }
        }
    }
    public void selecetanser3(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn3_strong_disagree_Id){
            if (rb.isChecked()){
                answer3="1";
            }

        }else if (id==R.id.qsn3_disagree_Id){
            if (rb.isChecked()){
                answer3="2";
            }

        }else if (id==R.id.qsn3_neutral_Id){
            if (rb.isChecked()){
                answer3="3";
            }

        }else if (id==R.id.qsn3_agree_Id) {
            if (rb.isChecked()){
                answer3="4";
            }
        }else if (id==R.id.qsn3_strong_agree_Id) {
            if (rb.isChecked()){
                answer3="5";
            }
        }
    }
    public void selecetanser4(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn4_strong_disagree_Id){
            if (rb.isChecked()){
                answer4="1";
            }

        }else if (id==R.id.qsn4_disagree_Id){
            if (rb.isChecked()){
                answer4="2";
            }

        }else if (id==R.id.qsn4_neutral_Id){
            if (rb.isChecked()){
                answer4="3";
            }

        }else if (id==R.id.qsn4_agree_Id) {
            if (rb.isChecked()){
                answer4="4";
            }
        }else if (id==R.id.qsn4_strong_agree_Id) {
            if (rb.isChecked()){
                answer4="5";
            }
        }
    }
    public void selecetanser5(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn5_strong_disagree_Id){
            if (rb.isChecked()){
                answer5="1";
            }

        }else if (id==R.id.qsn5_disagree_Id){
            if (rb.isChecked()){
                answer5="2";
            }

        }else if (id==R.id.qsn5_neutral_Id){
            if (rb.isChecked()){
                answer5="3";
            }

        }else if (id==R.id.qsn5_agree_Id) {
            if (rb.isChecked()){
                answer5="4";
            }
        }else if (id==R.id.qsn5_strong_agree_Id) {
            if (rb.isChecked()){
                answer5="5";
            }
        }
    }
    public void selecetanser6(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn6_strong_disagree_Id){
            if (rb.isChecked()){
                answer6="1";
            }

        }else if (id==R.id.qsn6_disagree_Id){
            if (rb.isChecked()){
                answer6="2";
            }

        }else if (id==R.id.qsn6_neutral_Id){
            if (rb.isChecked()){
                answer6="3";
            }

        }else if (id==R.id.qsn6_agree_Id) {
            if (rb.isChecked()){
                answer6="4";
            }
        }else if (id==R.id.qsn6_strong_agree_Id) {
            if (rb.isChecked()){
                answer6="5";
            }
        }
    }
    public void selecetanser7(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn7_strong_disagree_Id){
            if (rb.isChecked()){
                answer7="1";
            }

        }else if (id==R.id.qsn7_disagree_Id){
            if (rb.isChecked()){
                answer7="2";
            }

        }else if (id==R.id.qsn7_neutral_Id){
            if (rb.isChecked()){
                answer7="3";
            }

        }else if (id==R.id.qsn7_agree_Id) {
            if (rb.isChecked()){
                answer7="4";
            }
        }else if (id==R.id.qsn7_strong_agree_Id) {
            if (rb.isChecked()){
                answer7="5";
            }
        }
    }
    public void selecetanser8(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn8_strong_disagree_Id){
            if (rb.isChecked()){
                answer8="1";
            }

        }else if (id==R.id.qsn8_disagree_Id){
            if (rb.isChecked()){
                answer8="2";
            }

        }else if (id==R.id.qsn8_neutral_Id){
            if (rb.isChecked()){
                answer8="3";
            }

        }else if (id==R.id.qsn8_agree_Id) {
            if (rb.isChecked()){
                answer8="4";
            }
        }else if (id==R.id.qsn8_strong_agree_Id) {
            if (rb.isChecked()){
                answer8="5";
            }
        }
    }
    public void selecetanser9(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn9_strong_disagree_Id){
            if (rb.isChecked()){
                answer9="1";
            }

        }else if (id==R.id.qsn9_disagree_Id){
            if (rb.isChecked()){
                answer9="2";
            }

        }else if (id==R.id.qsn9_neutral_Id){
            if (rb.isChecked()){
                answer9="3";
            }

        }else if (id==R.id.qsn9_agree_Id) {
            if (rb.isChecked()){
                answer9="4";
            }
        }else if (id==R.id.qsn9_strong_agree_Id) {
            if (rb.isChecked()){
                answer9="5";
            }
        }
    }
    public void selecetanser10(View view) {
        RadioButton rb= (RadioButton) view;
        int id=rb.getId();

        if (id==R.id.qsn10_strong_disagree_Id){
            if (rb.isChecked()){
                answer10="1";
            }

        }else if (id==R.id.qsn10_disagree_Id){
            if (rb.isChecked()){
                answer10="2";
            }

        }else if (id==R.id.qsn10_neutral_Id){
            if (rb.isChecked()){
                answer10="3";
            }

        }else if (id==R.id.qsn10_agree_Id) {
            if (rb.isChecked()){
                answer10="4";
            }
        }else if (id==R.id.qsn10_strong_agree_Id) {
            if (rb.isChecked()){
                answer10="5";
            }
        }
    }

    @Override
    public void onClick(View view) {
        if(answer1==null){
            Toast.makeText(this, "question 1 is unselected", Toast.LENGTH_SHORT).show();
        }else if(answer2==null){
            Toast.makeText(this, "question 2 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer3==null){
            Toast.makeText(this, "question 3 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer4==null){
            Toast.makeText(this, "question 4 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer5==null){
            Toast.makeText(this, "question 5 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer6==null){
            Toast.makeText(this, "question 6 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer7==null){
            Toast.makeText(this, "question 7 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer8==null){
            Toast.makeText(this, "question 8 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer9==null){
            Toast.makeText(this, "question 9 is unselected", Toast.LENGTH_SHORT).show();

        }else if(answer10==null){
            Toast.makeText(this, "question 10 is unselected", Toast.LENGTH_SHORT).show();

        }else {
            App2 app2 = new App2(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10);
            startActivity(new Intent(App2qsnActivity.this, App3qsnActivity.class)
                    .putExtra("basicinfo", basicInfo)
                    .putExtra("app1", app1)
                    .putExtra("app2", app2)
            );
        }
    }

    private void initializtion() {
        btnNext =findViewById(R.id.submit_id);
        tvApp=findViewById(R.id.tv_app_id);
        qsn1_selected1=findViewById(R.id.qsn1_strong_disagree_Id);
        qsn1_selected2=findViewById(R.id.qsn1_disagree_Id);
        qsn1_selected3=findViewById(R.id.qsn1_neutral_Id);
        qsn1_selected4=findViewById(R.id.qsn1_agree_Id);
        qsn1_selected5=findViewById(R.id.qsn1_strong_agree_Id);

        qsn2_selected1=findViewById(R.id.qsn2_strong_disagree_Id);
        qsn2_selected2=findViewById(R.id.qsn2_disagree_Id);
        qsn2_selected3=findViewById(R.id.qsn2_neutral_Id);
        qsn2_selected4=findViewById(R.id.qsn2_agree_Id);
        qsn2_selected5=findViewById(R.id.qsn2_strong_agree_Id);

        qsn3_selected1=findViewById(R.id.qsn3_strong_disagree_Id);
        qsn3_selected2=findViewById(R.id.qsn3_disagree_Id);
        qsn3_selected3=findViewById(R.id.qsn3_neutral_Id);
        qsn3_selected4=findViewById(R.id.qsn3_agree_Id);
        qsn3_selected5=findViewById(R.id.qsn3_strong_agree_Id);

        qsn4_selected1=findViewById(R.id.qsn4_strong_disagree_Id);
        qsn4_selected2=findViewById(R.id.qsn4_disagree_Id);
        qsn4_selected3=findViewById(R.id.qsn4_neutral_Id);
        qsn4_selected4=findViewById(R.id.qsn4_agree_Id);
        qsn4_selected5=findViewById(R.id.qsn4_strong_agree_Id);

        qsn5_selected1=findViewById(R.id.qsn5_strong_disagree_Id);
        qsn5_selected2=findViewById(R.id.qsn5_disagree_Id);
        qsn5_selected3=findViewById(R.id.qsn5_neutral_Id);
        qsn5_selected4=findViewById(R.id.qsn5_agree_Id);
        qsn5_selected5=findViewById(R.id.qsn5_strong_agree_Id);

        qsn6_selected1=findViewById(R.id.qsn6_strong_disagree_Id);
        qsn6_selected2=findViewById(R.id.qsn6_disagree_Id);
        qsn6_selected3=findViewById(R.id.qsn6_neutral_Id);
        qsn6_selected4=findViewById(R.id.qsn6_agree_Id);
        qsn6_selected5=findViewById(R.id.qsn6_strong_agree_Id);

        qsn7_selected1=findViewById(R.id.qsn7_strong_disagree_Id);
        qsn7_selected2=findViewById(R.id.qsn7_disagree_Id);
        qsn7_selected3=findViewById(R.id.qsn7_neutral_Id);
        qsn7_selected4=findViewById(R.id.qsn7_agree_Id);
        qsn7_selected5=findViewById(R.id.qsn7_strong_agree_Id);

        qsn8_selected1=findViewById(R.id.qsn8_strong_disagree_Id);
        qsn8_selected2=findViewById(R.id.qsn8_disagree_Id);
        qsn8_selected3=findViewById(R.id.qsn8_neutral_Id);
        qsn8_selected4=findViewById(R.id.qsn8_agree_Id);
        qsn8_selected5=findViewById(R.id.qsn8_strong_agree_Id);

        qsn9_selected1=findViewById(R.id.qsn9_strong_disagree_Id);
        qsn9_selected2=findViewById(R.id.qsn9_disagree_Id);
        qsn9_selected3=findViewById(R.id.qsn9_neutral_Id);
        qsn9_selected4=findViewById(R.id.qsn9_agree_Id);
        qsn9_selected5=findViewById(R.id.qsn9_strong_agree_Id);

        qsn10_selected1=findViewById(R.id.qsn10_strong_disagree_Id);
        qsn10_selected2=findViewById(R.id.qsn10_disagree_Id);
        qsn10_selected3=findViewById(R.id.qsn10_neutral_Id);
        qsn10_selected4=findViewById(R.id.qsn10_agree_Id);
        qsn10_selected5=findViewById(R.id.qsn10_strong_agree_Id);
    }
}

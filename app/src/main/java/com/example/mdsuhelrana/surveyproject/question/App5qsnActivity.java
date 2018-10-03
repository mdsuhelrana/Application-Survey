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
import com.example.mdsuhelrana.surveyproject.UserActivity;
import com.example.mdsuhelrana.surveyproject.data.AnswerBank;
import com.example.mdsuhelrana.surveyproject.data.App1;
import com.example.mdsuhelrana.surveyproject.data.App2;
import com.example.mdsuhelrana.surveyproject.data.App3;
import com.example.mdsuhelrana.surveyproject.data.App4;
import com.example.mdsuhelrana.surveyproject.data.BasicInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class App5qsnActivity extends AppCompatActivity implements View.OnClickListener{
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

    private BasicInfo basicInfo;
    private App1 app1;
    private App2 app2;
    private App3 app3;
    private App4 app4;
    DatabaseReference rootRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        rootRef= FirebaseDatabase.getInstance().getReference("survey");
        basicInfo= (BasicInfo) getIntent().getSerializableExtra("basicinfo");
        app1= (App1) getIntent().getSerializableExtra("app1");
        app2= (App2) getIntent().getSerializableExtra("app2");
        app3= (App3) getIntent().getSerializableExtra("app3");
        app4= (App4) getIntent().getSerializableExtra("app4");

        initializtion();
        tvApp.setText("5.Tourism Information");
        btnNext.setText("submit");
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
        if (answer1 == null) {
            Toast.makeText(this, "question 1 is unselected", Toast.LENGTH_SHORT).show();
        } else if (answer2 == null) {
            Toast.makeText(this, "question 2 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer3 == null) {
            Toast.makeText(this, "question 3 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer4 == null) {
            Toast.makeText(this, "question 4 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer5 == null) {
            Toast.makeText(this, "question 5 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer6 == null) {
            Toast.makeText(this, "question 6 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer7 == null) {
            Toast.makeText(this, "question 7 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer8 == null) {
            Toast.makeText(this, "question 8 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer9 == null) {
            Toast.makeText(this, "question 9 is unselected", Toast.LENGTH_SHORT).show();

        } else if (answer10 == null) {
            Toast.makeText(this, "question 10 is unselected", Toast.LENGTH_SHORT).show();

        } else {
            String rowId = rootRef.push().getKey();
            final AnswerBank answerBank = new AnswerBank(basicInfo.getGender(), basicInfo.getAge(), basicInfo.getEdulevel()
                    , app1.getAnswer1(), app1.getAnswer2(), app1.getAnswer3(), app1.getAnswer4(), app1.getAnswer5()
                    , app1.getAnswer6(), app1.getAnswer7(), app1.getAnswer8(), app1.getAnswer9(), app1.getAnswer10()
                    , app2.getAnswer1(), app2.getAnswer2(), app2.getAnswer3(), app2.getAnswer4(), app2.getAnswer5()
                    , app2.getAnswer6(), app2.getAnswer7(), app2.getAnswer8(), app2.getAnswer9(), app2.getAnswer10()
                    , app3.getAnswer1(), app3.getAnswer2(), app3.getAnswer3(), app3.getAnswer4(), app3.getAnswer5()
                    , app3.getAnswer6(), app3.getAnswer7(), app3.getAnswer8(), app3.getAnswer9(), app3.getAnswer10()
                    , app4.getAnswer1(), app4.getAnswer2(), app4.getAnswer3(), app4.getAnswer4(), app4.getAnswer5()
                    , app4.getAnswer6(), app4.getAnswer7(), app4.getAnswer8(), app4.getAnswer9(), app4.getAnswer10()
                    , answer1, answer2, answer3, answer4, answer5
                    , answer6, answer7, answer8, answer9, answer10);
            rootRef.child(rowId).setValue(answerBank);

            Intent intent=new Intent(App5qsnActivity.this, UserActivity.class);
            intent.putExtra("key",answerBank);
            startActivity(intent);
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

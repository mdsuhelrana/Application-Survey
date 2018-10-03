package com.example.mdsuhelrana.surveyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.mdsuhelrana.surveyproject.data.AnswerBank;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AdminActivity extends AppCompatActivity {
  DatabaseReference rootRef;
    private ArrayList<AnswerBank> answerBanks=new ArrayList<>();

    SurveyBaseAdapter adapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        listView=findViewById(R.id.listview_id);
        rootRef= FirebaseDatabase.getInstance().getReference("survey");
        rootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               // answerBanks.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    AnswerBank answerBank=snapshot.getValue(AnswerBank.class);
                    answerBanks.add(answerBank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        adapter=new SurveyBaseAdapter(this,answerBanks);
        listView.setAdapter(adapter);
    }
}

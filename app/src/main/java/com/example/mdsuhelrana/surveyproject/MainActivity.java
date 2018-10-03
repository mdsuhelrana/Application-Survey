package com.example.mdsuhelrana.surveyproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button startSurvey;
    final String pincode="7896";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startSurvey=findViewById(R.id.startservey_Id);
        startSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,BasicInfoActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_admin_id:
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.create();
                LayoutInflater inflater=LayoutInflater.from(MainActivity.this);
                View dialogView=inflater.inflate(R.layout.pincode,null,false);
                builder.setView(dialogView);
                final EditText etPin=dialogView.findViewById(R.id.et_pin_id);
                Button btnShow=dialogView.findViewById(R.id.btn_show_id);
                btnShow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String pin=etPin.getText().toString();
                           if (pincode.equals(pin)) {
                               startActivity(new Intent(MainActivity.this, AdminActivity.class));
                           }else {
                                Toast.makeText(MainActivity.this, "sorry pin was wrong", Toast.LENGTH_SHORT).show();
                           }
                    }
                });
                builder.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("do you want to close this ?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog=builder.create();

        alertDialog.show();
    }
}

package com.example.mdsuhelrana.surveyproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mdsuhelrana.surveyproject.data.AnswerBank;

import java.util.ArrayList;

/**
 * Created by Md Suhel Rana on 9/15/2018.
 */

public class SurveyBaseAdapter extends BaseAdapter {
    private String age,gender,education;
    private String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,
            ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20,
            ans21,ans22,ans23,ans24,ans25,ans26,ans27,ans28,ans29,ans30,
            ans31,ans32,ans33,ans34,ans35,ans36,ans37,ans38,ans39,ans40,
            ans41,ans42,ans43,ans44,ans45,ans46,ans47,ans48,ans49,ans50;
    Context context;
    ArrayList<AnswerBank>answerBanks;


    public SurveyBaseAdapter(Context context,ArrayList<AnswerBank> answerBanks) {
        this.context = context;
        this.answerBanks = answerBanks;

    }

    @Override
    public int getCount() {
        return answerBanks.size();
    }

    @Override
    public Object getItem(int position) {
        return answerBanks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.model_table, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        AnswerBank answerBank= (AnswerBank) getItem(position);

        age=answerBank.getAge();
        gender=answerBank.getGender();
        education=answerBank.getEdulevel();

        ans1=answerBank.getAnswer1();
        ans2=answerBank.getAnswer2();
        ans3=answerBank.getAnswer3();
        ans4=answerBank.getAnswer4();
        ans5=answerBank.getAnswer5();
        ans6=answerBank.getAnswer6();
        ans7=answerBank.getAnswer7();
        ans8=answerBank.getAnswer8();
        ans9=answerBank.getAnswer9();
        ans10=answerBank.getAnswer10();

        ans11=answerBank.getAnswer11();
        ans12=answerBank.getAnswer12();
        ans13=answerBank.getAnswer13();
        ans14=answerBank.getAnswer14();
        ans15=answerBank.getAnswer15();
        ans16=answerBank.getAnswer16();
        ans17=answerBank.getAnswer17();
        ans18=answerBank.getAnswer18();
        ans19=answerBank.getAnswer19();
        ans20=answerBank.getAnswer20();

        ans21=answerBank.getAnswer21();
        ans22=answerBank.getAnswer22();
        ans23=answerBank.getAnswer23();
        ans24=answerBank.getAnswer24();
        ans25=answerBank.getAnswer25();
        ans26=answerBank.getAnswer26();
        ans27=answerBank.getAnswer27();
        ans28=answerBank.getAnswer28();
        ans29=answerBank.getAnswer29();
        ans30=answerBank.getAnswer30();

        ans31=answerBank.getAnswer31();
        ans32=answerBank.getAnswer32();
        ans33=answerBank.getAnswer33();
        ans34=answerBank.getAnswer34();
        ans35=answerBank.getAnswer35();
        ans36=answerBank.getAnswer36();
        ans37=answerBank.getAnswer37();
        ans38=answerBank.getAnswer38();
        ans39=answerBank.getAnswer39();
        ans40=answerBank.getAnswer40();

        ans41=answerBank.getAnswer41();
        ans42=answerBank.getAnswer42();
        ans43=answerBank.getAnswer43();
        ans44=answerBank.getAnswer44();
        ans45=answerBank.getAnswer45();
        ans46=answerBank.getAnswer46();
        ans47=answerBank.getAnswer47();
        ans48=answerBank.getAnswer48();
        ans49=answerBank.getAnswer49();
        ans50=answerBank.getAnswer50();

        String sus1= sumOfScore(ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10);
        String sus2= sumOfScore(ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20);
        String sus3= sumOfScore(ans21,ans22,ans23,ans24,ans25,ans26,ans27,ans28,ans29,ans30);
        String sus4= sumOfScore(ans31,ans32,ans33,ans34,ans35,ans36,ans37,ans38,ans39,ans40);
        String sus5= sumOfScore(ans41,ans42,ans43,ans44,ans45,ans46,ans47,ans48,ans49,ans50);

        holder.txtPosition.setText(String.valueOf(position+1));
        holder.tvAge.setText(age);
        holder.tvGender.setText(gender);
        holder.tvEdulevel.setText(education);

        holder.app1_1.setText(ans1);
        holder.app1_2.setText(ans2);
        holder.app1_3.setText(ans3);
        holder.app1_4.setText(ans4);
        holder.app1_5.setText(ans5);
        holder.app1_6.setText(ans6);
        holder.app1_7.setText(ans7);
        holder.app1_8.setText(ans8);
        holder.app1_9.setText(ans9);
        holder.app1_10.setText(ans10);

        holder.app2_1.setText(ans11);
        holder.app2_2.setText(ans12);
        holder.app2_3.setText(ans13);
        holder.app2_4.setText(ans14);
        holder.app2_5.setText(ans15);
        holder.app2_6.setText(ans16);
        holder.app2_7.setText(ans17);
        holder.app2_8.setText(ans18);
        holder.app2_9.setText(ans19);
        holder.app2_10.setText(ans20);

        holder.app3_1.setText(ans21);
        holder.app3_2.setText(ans22);
        holder.app3_3.setText(ans23);
        holder.app3_4.setText(ans24);
        holder.app3_5.setText(ans25);
        holder.app3_6.setText(ans26);
        holder.app3_7.setText(ans27);
        holder.app3_8.setText(ans28);
        holder.app3_9.setText(ans29);
        holder.app3_10.setText(ans30);

        holder.app4_1.setText(ans31);
        holder.app4_2.setText(ans32);
        holder.app4_3.setText(ans33);
        holder.app4_4.setText(ans34);
        holder.app4_5.setText(ans35);
        holder.app4_6.setText(ans36);
        holder.app4_7.setText(ans37);
        holder.app4_8.setText(ans38);
        holder.app4_9.setText(ans39);
        holder.app4_10.setText(ans40);

        holder.app5_1.setText(ans41);
        holder.app5_2.setText(ans42);
        holder.app5_3.setText(ans43);
        holder.app5_4.setText(ans44);
        holder.app5_5.setText(ans45);
        holder.app5_6.setText(ans46);
        holder.app5_7.setText(ans47);
        holder.app5_8.setText(ans48);
        holder.app5_9.setText(ans49);
        holder.app5_10.setText(ans50);

        holder.tvsus1.setText(sus1);
        holder.tvsus2.setText(sus2);
        holder.tvsus3.setText(sus3);
        holder.tvsus4.setText(sus4);
        holder.tvsus5.setText(sus5);

        return convertView;
    }


    public class ViewHolder{
        TextView txtPosition;
        TextView tvAge,tvGender,tvEdulevel;
        TextView app1_1,app1_2,app1_3, app1_4, app1_5, app1_6, app1_7,app1_8, app1_9, app1_10;
        TextView app2_1,app2_2,app2_3, app2_4, app2_5, app2_6, app2_7,app2_8, app2_9, app2_10;
        TextView app3_1,app3_2,app3_3, app3_4, app3_5, app3_6, app3_7,app3_8, app3_9, app3_10;
        TextView app4_1,app4_2,app4_3, app4_4, app4_5, app4_6, app4_7,app4_8, app4_9, app4_10;
        TextView app5_1,app5_2,app5_3, app5_4, app5_5, app5_6, app5_7,app5_8, app5_9, app5_10;
        TextView tvsus1,tvsus2,tvsus3,tvsus4,tvsus5;

        public ViewHolder(View itemView){
            txtPosition=itemView.findViewById(R.id.txtposition_id);
            tvAge=itemView.findViewById(R.id.table_age_id);
            tvGender=itemView.findViewById(R.id.table_gender_id);
            tvEdulevel=itemView.findViewById(R.id.table_education_id);

            app1_1=itemView.findViewById(R.id.app1_1_id);
            app1_2=itemView.findViewById(R.id.app1_2_id);
            app1_3=itemView.findViewById(R.id.app1_3_id);
            app1_4=itemView.findViewById(R.id.app1_4_id);
            app1_5=itemView.findViewById(R.id.app1_5_id);
            app1_6=itemView.findViewById(R.id.app1_6_id);
            app1_7=itemView.findViewById(R.id.app1_7_id);
            app1_8=itemView.findViewById(R.id.app1_8_id);
            app1_9=itemView.findViewById(R.id.app1_9_id);
            app1_10=itemView.findViewById(R.id.app1_10_id);

            app2_1=itemView.findViewById(R.id.app2_1_id);
            app2_2=itemView.findViewById(R.id.app2_2_id);
            app2_3=itemView.findViewById(R.id.app2_3_id);
            app2_4=itemView.findViewById(R.id.app2_4_id);
            app2_5=itemView.findViewById(R.id.app2_5_id);
            app2_6=itemView.findViewById(R.id.app2_6_id);
            app2_7=itemView.findViewById(R.id.app2_7_id);
            app2_8=itemView.findViewById(R.id.app2_8_id);
            app2_9=itemView.findViewById(R.id.app2_9_id);
            app2_10=itemView.findViewById(R.id.app2_10_id);

            app3_1=itemView.findViewById(R.id.app3_1_id);
            app3_2=itemView.findViewById(R.id.app3_2_id);
            app3_3=itemView.findViewById(R.id.app3_3_id);
            app3_4=itemView.findViewById(R.id.app3_4_id);
            app3_5=itemView.findViewById(R.id.app3_5_id);
            app3_6=itemView.findViewById(R.id.app3_6_id);
            app3_7=itemView.findViewById(R.id.app3_7_id);
            app3_8=itemView.findViewById(R.id.app3_8_id);
            app3_9=itemView.findViewById(R.id.app3_9_id);
            app3_10=itemView.findViewById(R.id.app3_10_id);

            app4_1=itemView.findViewById(R.id.app4_1_id);
            app4_2=itemView.findViewById(R.id.app4_2_id);
            app4_3=itemView.findViewById(R.id.app4_3_id);
            app4_4=itemView.findViewById(R.id.app4_4_id);
            app4_5=itemView.findViewById(R.id.app4_5_id);
            app4_6=itemView.findViewById(R.id.app4_6_id);
            app4_7=itemView.findViewById(R.id.app4_7_id);
            app4_8=itemView.findViewById(R.id.app4_8_id);
            app4_9=itemView.findViewById(R.id.app4_9_id);
            app4_10=itemView.findViewById(R.id.app4_10_id);

            app5_1=itemView.findViewById(R.id.app5_1_id);
            app5_2=itemView.findViewById(R.id.app5_2_id);
            app5_3=itemView.findViewById(R.id.app5_3_id);
            app5_4=itemView.findViewById(R.id.app5_4_id);
            app5_5=itemView.findViewById(R.id.app5_5_id);
            app5_6=itemView.findViewById(R.id.app5_6_id);
            app5_7=itemView.findViewById(R.id.app5_7_id);
            app5_8=itemView.findViewById(R.id.app5_8_id);
            app5_9=itemView.findViewById(R.id.app5_9_id);
            app5_10=itemView.findViewById(R.id.app5_10_id);

            tvsus1=itemView.findViewById(R.id.sus1_id);
            tvsus2=itemView.findViewById(R.id.sus2_id);
            tvsus3=itemView.findViewById(R.id.sus3_id);
            tvsus4=itemView.findViewById(R.id.sus4_id);
            tvsus5=itemView.findViewById(R.id.sus5_id);

        }

    }

    private String sumOfScore(String anss1, String anss2,
                              String anss3, String anss4,
                              String anss5, String anss6,
                              String anss7, String anss8,
                              String anss9, String anss10)
    {
        int x1=Integer.parseInt(anss1);
        int x2=Integer.parseInt(anss2);
        int x3=Integer.parseInt(anss3);
        int x4=Integer.parseInt(anss4);
        int x5=Integer.parseInt(anss5);
        int x6=Integer.parseInt(anss6);
        int x7=Integer.parseInt(anss7);
        int x8=Integer.parseInt(anss8);
        int x9=Integer.parseInt(anss9);
        int x10=Integer.parseInt(anss10);
        int result=((x1+x3+x5+x7+x9)-5)+(25-(x2+x4+x6+x8+x10));
        float sus=(float) (result*2.5);
        return String.valueOf(sus);
    }
}

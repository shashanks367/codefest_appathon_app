package com.example.shahsank.health;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class cchart extends AppCompatActivity {
    public static Spinner spinner1;
    public static Spinner spinner2;
    public static Spinner spinner3;
    public static Spinner spinner4;
    public static Spinner spinner5;
    public static Button btnSubmit;
    public static String txt1="";
    public static String txt2="";
    public static String txt3="";
    public static String txt4="";
    public static String txt5="";
    public static int n1=0;
    public static int n2=0;
    public static int n3=0;
    public static int n4=0;
    public static int n5=0;
    public static int sum=0;
    EditText et1, et2, et3, et4, et5;
    TextView tvresult;


    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cchart);
        Button btnSubmit = (Button) findViewById(R.id.btnsubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), calc.class);
                i.putExtra("Value",txt1);
                startActivity(i);
            }
        });
    }



    public void ReadTextFromUser() {

        et1 = (EditText) findViewById(R.id.edit2);
        String value1 = et1.getText().toString();


        try {
            int n1 = Integer.parseInt(value1);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println("not a number");
        }


        //int n1=Integer.parseInt(value1);
        et2 = (EditText) findViewById(R.id.edit3);
        String value2 = et2.getText().toString();
        try {
            int n2 = Integer.parseInt(value2);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println("not a number");
        }
        //int n2=Integer.parseInt(value2);
        et3 = (EditText) findViewById(R.id.edit4);
        String value3 = et3.getText().toString();
        try {
            int n3 = Integer.parseInt(value3);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println("not a number");
        }
        //int n3=Integer.parseInt(value3);
        et4 = (EditText) findViewById(R.id.edit5);
        String value4 = et4.getText().toString();
        try {
            int n4 = Integer.parseInt(value4);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println("not a number");
        }
        //int n4=Integer.parseInt(value4);
        et5 = (EditText) findViewById(R.id.edit6);
        String value5 = et5.getText().toString();
        try {
            int n5 = Integer.parseInt(value5);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println("not a number");
        }

        //int n5=Integer.parseInt(value5);
    }

    public void addListenerOnSpinnerItemSelection() {


        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                txt1 = spinner1.getSelectedItem().toString();

                if(txt1.equals("DAL(CUP)"))
                    sum= sum+ n1*150;
                else if(txt1=="SABJI(CUP)")
                    sum= sum+ n1*150;
                else if(txt1=="EGG")
                    sum= sum+ n1*100;

                else if(txt1=="CHAPATI")
                    sum= sum+ n1*60;

                else if(txt1=="PURI")
                    sum= sum+ n1*75;

                else if(txt1=="PARATHA")
                    sum= sum+ n1*150;

                else if(txt1=="COOKED RICE(CUP)")
                    sum= sum+ n1*120;

                else if(txt1=="CURD(CUP)")
                    sum= sum+ n1*100;

                else if(txt1=="MILK(CUP)")
                    sum= sum+ n1*75;

                else if(txt1=="SOUP(CUP)")
                    sum= sum+ n1*100;
                else if(txt1=="SELECT ITEM")
                    sum=sum+0;



            }

            public void onNothingSelected(AdapterView<?> arg0) {
                //TODO Auto-generated method stub
            }



        });

        spinner1 = (Spinner) findViewById(R.id.spinner2);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                txt2 = spinner1.getSelectedItem().toString();

                if(txt2=="DAL")
                    sum= sum+ n2*150;
                else if(txt2=="SABJI")
                    sum= sum+ n2*150;
                else if(txt2=="EGG")
                    sum= sum+ n2*100;

                else if(txt2=="CHAPATI")
                    sum= sum+ n2*60;

                else if(txt2=="PURI")
                    sum= sum+ n2*75;

                else if(txt2=="PARATHA")
                    sum= sum+ n2*150;

                else if(txt2=="COOKED RICE")
                    sum= sum+ n2*120;

                else if(txt2=="CURD")
                    sum= sum+ n2*100;

                else if(txt2=="MILK")
                    sum= sum+ n2*75;

                else if(txt2=="SOUP")
                    sum= sum+ n2*100;
                else if(txt2=="SELECT ITEM")
                    sum=sum+0;
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                //TODO Auto-generated method stub
            }
        });
        spinner1 = (Spinner) findViewById(R.id.spinner3);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                txt3 = spinner1.getSelectedItem().toString();

                if(txt3=="DAL")
                    sum= sum+ n3*150;
                else if(txt3=="SABJI")
                    sum= sum+ n3*150;
                else if(txt3=="EGG")
                    sum= sum+ n3*100;

                else if(txt3=="CHAPATI")
                    sum= sum+ n3*60;

                else if(txt3=="PURI")
                    sum= sum+ n3*75;

                else if(txt3=="PARATHA")
                    sum= sum+ n3*150;

                else if(txt3=="COOKED RICE")
                    sum= sum+ n3*120;

                else if(txt3=="CURD")
                    sum= sum+ n3*100;

                else if(txt3=="MILK")
                    sum= sum+ n3*75;

                else if(txt3=="SOUP")
                    sum= sum+ n3*100;
                else if(txt3=="SELECT ITEM")
                    sum=sum+0;

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                //TODO Auto-generated method stub
            }
        });
        spinner1 = (Spinner) findViewById(R.id.spinner4);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                txt4 = spinner1.getSelectedItem().toString();


                if(txt4=="DAL")
                    sum= sum+ n4*150;
                else if(txt4=="SABJI")
                    sum= sum+ n4*150;
                else if(txt4=="EGG")
                    sum= sum+ n4*100;

                else if(txt4=="CHAPATI")
                    sum= sum+ n4*60;
                else if(txt4=="PURI")
                    sum= sum+ n4*75;

                else if(txt4=="PARATHA")
                    sum= sum+ n4*150;

                else if(txt4=="COOKED RICE")
                    sum= sum+ n4*120;

                else if(txt4=="CURD")
                    sum= sum+ n4*100;

                else if(txt4=="MILK")
                    sum= sum+ n4*75;

                else if(txt4=="SOUP")
                    sum= sum+ n4*100;
                else if(txt4=="SELECT ITEM")
                    sum=sum+0;

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                //TODO Auto-generated method stub
            }
        });
        spinner1 = (Spinner) findViewById(R.id.spinner5);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                txt5 = spinner1.getSelectedItem().toString();


                if(txt5=="DAL")
                    sum= sum+ n5*150;
                else if(txt5=="SABJI")
                    sum= sum+ n5*150;
                else if(txt5=="EGG")
                    sum= sum+ n5*100;

                else if(txt5=="CHAPATI")
                    sum= sum+ n5*60;

                else if(txt5=="PURI")
                    sum= sum+ n5*75;

                else if(txt5=="PARATHA")
                    sum= sum+ n5*150;

                else if(txt5=="COOKED RICE")
                    sum= sum+ n5*120;

                else if(txt5=="CURD")
                    sum= sum+ n5*100;

                else if(txt5=="MILK")
                    sum= sum+ n5*75;

                else if(txt5=="SOUP")
                    sum= sum+ n5*100;
                else if(txt5=="SELECT ITEM")
                    sum=sum+0;

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                //TODO Auto-generated method stub
            }
        });


    

    }

}

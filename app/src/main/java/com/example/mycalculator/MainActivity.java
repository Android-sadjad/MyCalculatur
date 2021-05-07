package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button zeroBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn;
        Button devideBtn,multyBtn,plusBtn,minusBtn,equalBtn,datBtn,acBtn,pmBtn,modBtn;
        EditText eddit;
        String selectedOperate ="";
        String oldNumber = "";
        Boolean newoperation=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();







    }


    public void onClicked(View view) {
        if(newoperation){
            eddit.setText("0");
        }
        newoperation =false;
        String eddittext = eddit.getText().toString();

        if (view == zeroBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("0");
            } else {
                eddittext += "0";
                eddit.setText(eddittext);
            }
        }


        if (view == oneBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("1");
            } else {
                eddittext += "1";
                eddit.setText(eddittext);
            }
        }


        if (view == twoBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("2");
            } else {
                eddittext += "2";
                eddit.setText(eddittext);
            }
        }

        if (view == threeBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("3");
            } else {
                eddittext += "3";
                eddit.setText(eddittext);
            }
        }


        if (view == fourBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("4");
            } else {
                eddittext += "4";
                eddit.setText(eddittext);
            }
        }


        if (view == fiveBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("5");
            } else {
                eddittext += "5";
                eddit.setText(eddittext);
            }
        }


        if (view == sixBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("6");
            } else {
                eddittext += "6";
                eddit.setText(eddittext);
            }
        }


        if (view == sevenBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("7");
            } else {
                eddittext += "7";
                eddit.setText(eddittext);
            }
        }


        if (view == eightBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("8");
            } else {
                eddittext += "8";
                eddit.setText(eddittext);
            }
        }


        if (view == nineBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("9");
            } else {
                eddittext += "9";
                eddit.setText(eddittext);
            }
        }



        if (view == datBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("0.");
            } else {
                int datValue =eddittext.indexOf('.');
                if (datValue==-1){
                eddittext += ".";
                eddit.setText(eddittext);
                }
            }
        }



    }



    private void findView() {
        oneBtn = findViewById(R.id.one_btn);
        twoBtn = findViewById(R.id.two_btn);
        threeBtn = findViewById(R.id.three_btn);
        fourBtn = findViewById(R.id.four_btn);
        fiveBtn = findViewById(R.id.five_btn);
        sixBtn = findViewById(R.id.six_btn);
        sevenBtn = findViewById(R.id.seven_btn);
        eightBtn = findViewById(R.id.eight_btn);
        nineBtn = findViewById(R.id.nine_btn);
        zeroBtn = findViewById(R.id.zero_btn);
        datBtn = findViewById(R.id.dat_btn);
        equalBtn = findViewById(R.id.equal_btn);
        multyBtn = findViewById(R.id.multy_btn);
        devideBtn = findViewById(R.id.divide_btn);
        minusBtn = findViewById(R.id.minus_btn);
        pmBtn = findViewById(R.id.pm_btn);
        acBtn = findViewById(R.id.ac_btn);
        plusBtn = findViewById(R.id.plus_btn);
         modBtn= findViewById(R.id.mod_btn);
        eddit = findViewById(R.id.eddit_txt);

    }
public void operate(View v){
oldNumber = eddit.getText().toString();
if(v==devideBtn){
    selectedOperate="/";
}

    if(v==plusBtn){
        selectedOperate="+";
    }

    if(v==minusBtn){
        selectedOperate="-";
    }
    if(v==multyBtn){
        selectedOperate="*";
    }
    if(v==modBtn){
        selectedOperate="%";
    }

clear();
}

    private void clear() {
        eddit.setText("0");
    }
    public void equalClicked(View view) {
     if (!selectedOperate.equals("") && !oldNumber.equals("")){
         Double answer = 0.0 ;
         Double newNumber= Double.parseDouble(eddit.getText().toString());

         if(selectedOperate.equals("+")){
             answer=(Double.parseDouble(oldNumber)+newNumber);
         }
         if(selectedOperate.equals("-")){
             answer=(Double.parseDouble(oldNumber)-newNumber);
         }
         if(selectedOperate.equals("*")){
             answer=(Double.parseDouble(oldNumber)*newNumber);
         }
         if(selectedOperate.equals("/")){
             answer=(Double.parseDouble(oldNumber)/newNumber);
         }
         if(selectedOperate.equals("%")){
             answer=(Double.parseDouble(oldNumber)%newNumber);
         }
         eddit.setText(answer.toString());
         newoperation = true;

     }

    }

    public void AcCleaner(View view) {
        newoperation = true;
        eddit.setText("0");
        selectedOperate ="";
        oldNumber ="";
    }

    public void SingOperator(View view) {
        String eddittext = eddit.getText().toString();
        if (view == pmBtn) {
            if (eddittext.equals("") || eddittext.equals("0")) {
                eddit.setText("0");
            } else {
                if(eddittext.startsWith("-")){
                    eddittext=eddittext.substring(1,eddittext.length()+1);
                    eddit.setText(eddittext);
                }
                else {
                    //chi bedonam
                }
            }
        }
    }
}
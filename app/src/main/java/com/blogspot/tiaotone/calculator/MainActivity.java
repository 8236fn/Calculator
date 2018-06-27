package com.blogspot.tiaotone.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private Button btnBack,btnClear,btnPoint,btnEquals;
    private Button btnAdd,btnSubtract,btnMultiply,btnDivided;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private double theValue = 0, operand1 = 0, operand2 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        display = (TextView)findViewById(R.id.display);
        btnBack = (Button)findViewById(R.id.btnBack);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSubtract = (Button)findViewById(R.id.btnSubtract);
        btnMultiply = (Button)findViewById(R.id.btnMultiplay);
        btnDivided = (Button)findViewById(R.id.btnDivided);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        btnPoint.setText(".");
        btnEquals.setText("=");
        btnAdd.setText("+");
        btnSubtract.setText("-");
        btnMultiply.setText("*");
        btnDivided.setText("/");
        btn0.setText("0");
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");

        btnBack.setOnClickListener(onClickListener);
        btnClear.setOnClickListener(onClickListener);
        btnPoint.setOnClickListener(onClickListener);
        btnEquals.setOnClickListener(onClickListener);
        btnAdd.setOnClickListener(onClickListener);
        btnSubtract.setOnClickListener(onClickListener);
        btnMultiply.setOnClickListener(onClickListener);
        btnDivided.setOnClickListener(onClickListener);
        btn0.setOnClickListener(onClickListener);
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
        btn6.setOnClickListener(onClickListener);
        btn7.setOnClickListener(onClickListener);
        btn8.setOnClickListener(onClickListener);
        btn9.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int btnId = ((Button)view).getId();
            String displayStr = display.getText().toString();
            switch (btnId){
                case R.id.btnBack:
                    if (displayStr.length()>1)
                        display.setText(displayStr.substring(0,displayStr.length()-1));
                    else if (displayStr.length()==1){

                    }
            }

        }
    };


}

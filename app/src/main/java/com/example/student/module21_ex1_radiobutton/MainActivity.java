package com.example.student.module21_ex1_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btn_cal=(Button)findViewById(R.id.btn_cal);
        final TextView label_result=(TextView)findViewById(R.id.label_result);

        final RadioGroup groupOfRadio=(RadioGroup)findViewById(R.id.rdg_cal);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(groupOfRadio.getCheckedRadioButtonId()==-1){
                    label_result.setText("Vui lòng chọn phép tính");
                    return;
                }
                if(!checkValidInput()){
                    label_result.setText("Dữ liệu nhập không hợp lệ");
                    return;
                }
                switch (groupOfRadio.getCheckedRadioButtonId()){
                    case R.id.rd_plus:
                        label_result.setText(plus()+"");
                        break;
                    case R.id.rd_minus:
                        label_result.setText(minus()+"");
                        break;
                    case R.id.rd_mutil:
                        label_result.setText(mutil()+"");
                        break;
                    case R.id.rd_divide:
                        label_result.setText(divide()+"");
                        break;
                    default:break;
                }
            }
        });
    }
    private boolean checkValidInput(){
        try{
            final EditText text_numA=(EditText)findViewById(R.id.text_numA);
            final EditText text_numB=(EditText)findViewById(R.id.text_numB);
            double a=Double.parseDouble(text_numA.getText().toString());
            double b=Double.parseDouble(text_numB.getText().toString());
        } catch (Exception e){
            return false;
        }
        return true;
    }
    public double plus(){
        final EditText text_numA=(EditText)findViewById(R.id.text_numA);
        final EditText text_numB=(EditText)findViewById(R.id.text_numB);
        double a=Double.parseDouble(text_numA.getText().toString());
        double b=Double.parseDouble(text_numB.getText().toString());
        double result=a+b;
        return result;
    }
    public double minus(){
        final EditText text_numA=(EditText)findViewById(R.id.text_numA);
        final EditText text_numB=(EditText)findViewById(R.id.text_numB);
        double a=Double.parseDouble(text_numA.getText().toString());
        double b=Double.parseDouble(text_numB.getText().toString());
        double result=a-b;
        return result;
    }
    public double mutil(){
        final EditText text_numA=(EditText)findViewById(R.id.text_numA);
        final EditText text_numB=(EditText)findViewById(R.id.text_numB);
        double a=Double.parseDouble(text_numA.getText().toString());
        double b=Double.parseDouble(text_numB.getText().toString());
        double result=a*b;
        return result;
    }
    public double divide(){
        final EditText text_numA=(EditText)findViewById(R.id.text_numA);
        final EditText text_numB=(EditText)findViewById(R.id.text_numB);
        double a=Double.parseDouble(text_numA.getText().toString());
        double b=Double.parseDouble(text_numB.getText().toString());
        double result=a/b;
        return result;
    }
}

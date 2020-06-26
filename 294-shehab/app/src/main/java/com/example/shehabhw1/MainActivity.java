package com.example.shehabhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int[] array = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText q=findViewById(R.id.editText1);
        final EditText h=findViewById(R.id.editText2);
        final EditText m=findViewById(R.id.editText3);
        final EditText f=findViewById(R.id.editText4);
        final Button cal=findViewById(R.id.cal);
        final TextView text=findViewById(R.id.textViewCal);
        final TextView text2=findViewById(R.id.textViewCal2);
        final TextView text3=findViewById(R.id.textViewCal3);
        final TextView text4=findViewById(R.id.textViewCal4);
        final TextView text5=findViewById(R.id.textViewCal5);
Button reset =findViewById(R.id.reset);
reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       q.setText("");
       h.setText("");
       m.setText("");
       f.setText("");
       text.setText("");
       text2.setText("");
       text3.setText("");
       text4.setText("");
       text5.setText("");
       for (int i =0; i <array.length;i++) {
           array[i] = 0;
       }
    }
});

       cal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String quizesString = q.getText().toString();
               String hmoeworkString = h.getText().toString();
               String midtermsString = m.getText().toString();
               String finalString = f.getText().toString();

               double quizes = Double.parseDouble(quizesString);
               double homework = Double.parseDouble(hmoeworkString);
               double midterms = Double.parseDouble(midtermsString);
               double final1 = Double.parseDouble(finalString);
               double x = (quizes + homework + midterms + final1);

               if (x >=90.0)
               {text.setText("A");

               }else if(x >=80.0)
               {text2.setText("B");

               }else if(x >=70.0)
               {

                   text3.setText("C");
               }else if (x>=60.0)
               {


                   text4.setText("D");


               } else if(x<=60.0)

               {

                   text5.setText("F");
               }else if(x>=0)



               {


               }
               return;


           }

           }
       );



}
    }

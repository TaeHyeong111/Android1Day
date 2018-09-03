package app.rstone.com.myapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        findViewById(R.id.plus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                int sNum1 = Integer.parseInt(num1.getText().toString());
                EditText num2 = findViewById(R.id.num2);
                int sNum2 = Integer.parseInt(num2.getText().toString());
                TextView result = findViewById(R.id.result);
                String result1 = String.valueOf(sNum1+sNum2);
                result.setText(result1);
                Toast.makeText(ctx, "입력한 숫자값:"+result1,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.minus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                int sNum1 = Integer.parseInt(num1.getText().toString());
                EditText num2 = findViewById(R.id.num2);
                int sNum2 = Integer.parseInt(num2.getText().toString());
                TextView result = findViewById(R.id.result);
                result.setText(String.valueOf(sNum1-sNum2));
            }
        });
        findViewById(R.id.multi_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                int sNum1 = Integer.parseInt(num1.getText().toString());
                int sNum2 = Integer.parseInt(num2.getText().toString());
                result.setText(String.valueOf(sNum1*sNum2));
            }
        });
        findViewById(R.id.devide_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                int result1 = Integer.parseInt(num1.getText().toString())/
                        Integer.parseInt(num2.getText().toString());
                result.setText(String.valueOf(result1));
            }
        });
    }
}

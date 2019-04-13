package czj.whut.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton b_man;
    RadioButton b_woman;
    Button b_ok_1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_01);

        b_man = findViewById(R.id.choose_man_input);
        b_man.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b_woman.setChecked(false);
            }
        });

        b_woman = findViewById(R.id.choose_woman_input);
        b_woman.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b_man.setChecked(false);
            }
        });

        b_ok_1 = findViewById(R.id.Button_ok);
        b_ok_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText user_name = findViewById(R.id.user_name_input);
                String user_name_String = user_name.getText().toString();

                EditText user_password = findViewById(R.id.user_password_input);
                String user_password_String = user_password.getText().toString();

                String user_sex_String = "女";
                if(b_man.isChecked()) { user_sex_String = "男"; }

                Intent intent = new Intent(MainActivity.this,My_next.class);
                intent.putExtra("user_name_String",user_name_String);
                intent.putExtra("user_password_String",user_password_String);
                intent.putExtra("user_sex_String",user_sex_String);
                startActivity(intent);// 启动Activity
            }
        });

    }
}
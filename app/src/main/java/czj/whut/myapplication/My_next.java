package czj.whut.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class My_next extends AppCompatActivity {
    Button b_ok_2 ;
    TextView user_name,user_password,user_sex;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_02);

        Intent intent = getIntent();
        String user_name_String = intent.getStringExtra("user_name_String");
        String user_password_String = intent.getStringExtra("user_password_String");
        String user_sex_String = intent.getStringExtra("user_sex_String");

        user_name = findViewById(R.id.user_name_output);
        user_password = findViewById(R.id.user_password_output);
        user_sex = findViewById(R.id.user_sex_output);

        user_name.setText(user_name_String);
        user_password.setText(user_password_String);
        user_sex.setText(user_sex_String);

        b_ok_2 = findViewById(R.id.Bottom_send);
        b_ok_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(My_next.this,My_end.class);
                startActivity(intent);
            }
        });
    }
}

package soeonkim.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, tell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butSecond = (Button)findViewById(R.id.butSecond);
        butSecond.setOnClickListener(butSecondHandler);
        Intent intent = getIntent(); //
        name=intent.getStringExtra("name");
        tell=intent.getStringExtra("tell");
        TextView textResult = (TextView)findViewById(R.id.text_Result);
        textResult.setText("* 성명 : " + name + "\n * 전화번호 : " + tell);
    }
    View.OnClickListener butSecondHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}

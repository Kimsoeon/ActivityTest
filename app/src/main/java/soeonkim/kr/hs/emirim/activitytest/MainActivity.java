package soeonkim.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit_Name, edit_Tell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.butMain);
        EditText edit_Name = (EditText)findViewById(R.id.edit_Name);
        EditText edit_Tell = (EditText)findViewById(R.id.edit_Tell);
        butMain.setOnClickListener(butMainHandler);
    }
    View.OnClickListener butMainHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            String name = edit_Name.getText().toString();
            String tell = edit_Tell.getText().toString();
            intent.putExtra("name",name);
            intent.putExtra("tell",tell);
            startActivity(intent);
        }
    };

}

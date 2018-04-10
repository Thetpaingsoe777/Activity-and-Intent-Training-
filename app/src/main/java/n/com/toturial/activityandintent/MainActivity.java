package n.com.toturial.activityandintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,age;
    Button post;
    String sname,sage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.etname);
        age=(EditText)findViewById(R.id.etage);
        post=(Button)findViewById(R.id.btnpost);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Getdata.class);
                i.putExtra("names",name.getText().toString());
                startActivity(i);
            }
        });




    }
}

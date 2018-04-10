package n.com.toturial.activityandintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Getdata extends AppCompatActivity {
    TextView tvshow;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);

        tvshow=(TextView)findViewById(R.id.txtgetdata);
        Bundle b=getIntent().getExtras();
        data=b.getString("names");
        tvshow.setText(data);

    }
}

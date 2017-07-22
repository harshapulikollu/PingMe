package apps.shark.pingme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import apps.shark.pingme.ui.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, ChatListActivity.class);
        startActivity(intent);



    }

  }

package techlearn.com.navigationdemo;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class NavigationMore extends AppCompatActivity implements View.OnClickListener{

    TextView text1, text2, text3;
    Button btn1, btn2;

    DrawerLayout drawerLAyout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_more);

        initUI();
    }


    @Override
    public void onClick(View v) {


        //TODO..

        Toast.makeText(this, "clicked to navigate", Toast.LENGTH_SHORT).show();
        drawerLAyout.closeDrawers();



    }



    private void initUI() {

        drawerLAyout= (DrawerLayout) findViewById(R.id.drawer_layout);

        text1= (TextView) findViewById(R.id.nav_1);
        text2= (TextView) findViewById(R.id.nav_2);
        text3= (TextView) findViewById(R.id.nav_3);
        btn1= (Button) findViewById(R.id.nav_4);
        btn2= (Button) findViewById(R.id.nav_5);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }


}

package techlearn.com.navigationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class BasicNavigationActivity extends AppCompatActivity {

    private ListView navList;
    private String[] navItems={"Navigation More", "Scrollable Tabs", "Html & WebView", "Data Binding", "Setting"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navList = (ListView) findViewById(R.id.nav_list);


        navList = (ListView) findViewById(R.id.nav_list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navItems);
        navList.setAdapter(adapter);



        //to respond item click in list view
        navList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                        Intent intent=new Intent(BasicNavigationActivity.this, NavigationMore.class);
                        startActivity(intent);
                        break;


                    case 2:
                        Intent intent2=new Intent(BasicNavigationActivity.this, WebViewActivity.class);
                        startActivity(intent2);
                        break;


                }
            }
        });
    }
}


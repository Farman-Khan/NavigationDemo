package techlearn.com.navigationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://www.google.com");


        //to show small data use R.string.html_small
        String htmlData= getResources().getString(R.string.html_large);

        webView.loadData(htmlData, "text/html", "UTF-8");
    }
}

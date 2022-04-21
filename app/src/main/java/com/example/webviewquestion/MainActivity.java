package com.example.webviewquestion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    WebView wV;
    EditText et1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV = (WebView) findViewById(R.id.webView);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        wV.getSettings().setJavaScriptEnabled(true);

    }

    public void ClickedWeb(View view) {
        String url = et1.getText().toString();
        wV.loadUrl(url);
        wV.setWebViewClient(new MyWebViewClient());
    }


}
class MyWebViewClient extends WebViewClient {
    public boolean shouldOverideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}

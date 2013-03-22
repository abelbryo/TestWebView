package com.example.testwebview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	private WebView mWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mWebView = (WebView) findViewById(R.id.content);
		mWebView.getSettings().setJavaScriptEnabled(true);
		Runnable r = new Runnable() {

			@Override
			public void run() {
				WebViewClient wvc = new MyWebViewClient();
				mWebView.setWebViewClient(wvc);
				mWebView.loadUrl("file:///android_asset/hello.html");
			}
		};
		new Thread(r).start();

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

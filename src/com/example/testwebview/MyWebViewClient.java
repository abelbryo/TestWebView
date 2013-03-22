package com.example.testwebview;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		super.onPageStarted(view, url, favicon);
		StringBuilder builder = new StringBuilder(
				"javascript:window.document.body.style.paddingTop='100px';");
		builder.append("document.body.style.background='#b8b8b8';");
		builder.append("document.body.style.color='#063F5D';");
		
		view.loadUrl(builder.toString());
	}

} // == END ==

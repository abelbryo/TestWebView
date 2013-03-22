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
		builder.append("document.body.style.background='#cfcfcf';");
		builder.append("document.body.style.color='#ff0066';");
		view.loadUrl(builder.toString());
	}

} // == END ==

package com.example.highcharttext;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

@SuppressLint("JavascriptInterface")
public class MainActivity extends Activity {
	private static final String TAG = "chart";
	private WebView webview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		webview = (WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true); // 启用JS脚本
		webview.getSettings().setUseWideViewPort(true);
		webview.getSettings().setSupportZoom(true);// 支持缩放
		webview.getSettings().setBuiltInZoomControls(true);// 采用内置缩放装置
		webview.getSettings().setDefaultTextEncodingName("utf-8");
		// webview.setWebViewClient(client);
		
		webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);// 解决缓存问题
		webview.getSettings().setLoadWithOverviewMode(true);
		
			webview.getSettings().setDisplayZoomControls(false);
			webview.getSettings().setBuiltInZoomControls(false);
			webview.getSettings().setSupportZoom(false);
			
	
		webview.requestFocus();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.highchartBar:
			webview.addJavascriptInterface(new Json(), TAG);
			webview.loadUrl("file:///android_asset/highchart.html");
			break;

		case R.id.echartGauge:
			webview.loadUrl("file:///android_asset/echart.html");
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}

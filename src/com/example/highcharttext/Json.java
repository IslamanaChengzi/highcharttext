package com.example.highcharttext;

import android.webkit.JavascriptInterface;


public class Json {
	
	@JavascriptInterface//高版本兼容性，加入这个注解
	public String getTitle() {
		return "空气温度";
	}
	@JavascriptInterface//高版本兼容性，加入这个注解
	public String getUnit()
	{
		return "℃";
	}
	@JavascriptInterface//高版本兼容性，加入这个注解
	public String getSeries()
	{
		String chart="[{name:'温室大棚',data:[[Date.UTC(2014,04,08,16,57,16),26.00],[Date.UTC(2014,04,08,17,02,16),26.00],[Date.UTC(2014,04,08,17,07,16),26.00],[Date.UTC(2014,04,08,17,12,16),26.00],[Date.UTC(2014,04,08,17,17,16),26.00],[Date.UTC(2014,04,08,17,22,16),26.00],[Date.UTC(2014,04,08,17,27,16),26.00],[Date.UTC(2014,04,08,17,32,16),26.00],[Date.UTC(2014,04,08,17,37,16),26.00],[Date.UTC(2014,04,08,17,42,16),26.00],[Date.UTC(2014,04,08,17,47,16),26.00],[Date.UTC(2014,04,08,17,52,16),26.00],[Date.UTC(2014,04,08,17,57,16),26.00],[Date.UTC(2014,04,08,18,02,16),26.00],[Date.UTC(2014,04,08,18,07,16),26.00],[Date.UTC(2014,04,08,18,12,16),26.00],[Date.UTC(2014,04,08,18,17,16),26.00],[Date.UTC(2014,04,08,18,22,16),23.00],[Date.UTC(2014,04,08,18,27,16),23.00],[Date.UTC(2014,04,08,18,32,16),23.00],[Date.UTC(2014,04,08,18,37,16),23.00],[Date.UTC(2014,04,08,18,42,16),23.00],[Date.UTC(2014,04,08,18,47,16),23.00],[Date.UTC(2014,04,08,18,52,16),23.00],[Date.UTC(2014,04,08,18,57,16),23.00],[Date.UTC(2014,04,08,19,02,16),23.00],[Date.UTC(2014,04,08,19,07,16),23.00],[Date.UTC(2014,04,08,19,12,16),23.00],[Date.UTC(2014,04,08,19,17,16),23.00],[Date.UTC(2014,04,08,19,22,16),23.00],[Date.UTC(2014,04,08,19,27,16),23.00],[Date.UTC(2014,04,08,19,32,16),23.00],[Date.UTC(2014,04,08,19,37,16),23.00],[Date.UTC(2014,04,08,19,42,16),23.00],[Date.UTC(2014,04,08,19,47,16),23.00],[Date.UTC(2014,04,08,19,52,16),23.00],[Date.UTC(2014,04,08,19,57,16),23.00],[Date.UTC(2014,04,08,20,02,16),23.00],[Date.UTC(2014,04,08,20,07,16),23.00],[Date.UTC(2014,04,08,20,12,16),23.00],[Date.UTC(2014,04,08,20,17,16),23.00],[Date.UTC(2014,04,08,20,22,16),21.00],[Date.UTC(2014,04,08,20,27,16),21.00],[Date.UTC(2014,04,08,20,32,16),21.00],[Date.UTC(2014,04,08,20,37,16),21.00],[Date.UTC(2014,04,08,20,42,16),21.00],[Date.UTC(2014,04,08,20,47,16),21.00],[Date.UTC(2014,04,08,20,57,16),21.00],[Date.UTC(2014,04,08,21,02,16),21.00],[Date.UTC(2014,04,08,21,07,16),21.00],[Date.UTC(2014,04,08,21,12,16),21.00],[Date.UTC(2014,04,08,21,17,16),21.00],[Date.UTC(2014,04,08,21,22,16),21.00],[Date.UTC(2014,04,08,21,27,16),21.00],[Date.UTC(2014,04,08,21,32,16),21.00],[Date.UTC(2014,04,08,21,37,16),21.00],[Date.UTC(2014,04,08,21,42,16),21.00],[Date.UTC(2014,04,08,21,47,16),21.00],[Date.UTC(2014,04,08,21,52,16),21.00],[Date.UTC(2014,04,08,21,57,16),21.00],[Date.UTC(2014,04,08,22,02,16),21.00],[Date.UTC(2014,04,08,22,07,16),21.00],[Date.UTC(2014,04,08,22,12,16),21.00],[Date.UTC(2014,04,08,22,17,16),21.00]]}]";
		return chart;
	}
}

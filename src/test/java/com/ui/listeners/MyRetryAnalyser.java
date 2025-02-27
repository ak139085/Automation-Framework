package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyser implements IRetryAnalyzer {
	private static final int MAXNUMBEROFATTEMPTS = 3;
	private static int CURRENTATTEMPTS = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(CURRENTATTEMPTS<=MAXNUMBEROFATTEMPTS){
			CURRENTATTEMPTS++;
			return true;
		}

		return false;
	}

}

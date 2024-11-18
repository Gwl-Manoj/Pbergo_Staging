//
//  RetryAnalyzer.java
//  Created on September 25, 2017
// 
//  Copyright (c) 2017, NETGEAR, Inc.
//  350 East Plumeria, San Jose California, 95134, U.S.A.
//  All rights reserved.
// 
// 
//  This software is the confidential and proprietary information of
//  NETGEAR, Inc. ("Confidential Information"). You shall not
//  disclose such Confidential Information and shall use it only in
//  accordance with the terms of the license agreement you entered into
//  with NETGEAR.
// 
//  @author Sharon Wu
//  @brief analyze retired test cases 
// 

package com.pbergo.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		if (counter < retryLimit && !result.isSuccess()) {
			counter++;
			return true;
		}
		return false;
	}
}
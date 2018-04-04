package com.wood.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldJob implements Job {

	private static Logger logger = LoggerFactory.getLogger(HelloWorldJob.class);
	
	@Override
	public void execute(JobExecutionContext jobexecutioncontext)
			throws JobExecutionException {
		logger.error("这是Spring 整合Quartz的定时任务");
	}

}

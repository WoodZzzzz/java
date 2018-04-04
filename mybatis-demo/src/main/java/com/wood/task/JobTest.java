package com.wood.task;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.HolidayCalendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobTest {

	private static Logger logger = LoggerFactory.getLogger(JobTest.class);
	
	private static Scheduler scheduler;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_quartz.xml");
		scheduler = (StdScheduler) ctx.getBean("scheduler");
		
		startScheduler();
	}

	private static void startScheduler() {
		try {
			
            // 1、创建一个JobDetail实例，指定Quartz
            JobDetail jobDetail = JobBuilder.newJob(HelloWorldJob.class)
            // 任务执行类
                    .withIdentity("job1_1", "jGroup1")
                    // 任务名，任务组
                    .build();

            // 触发器类型
            //SimpleScheduleBuilder builder = SimpleScheduleBuilder
                    // 设置执行次数
                    //.repeatSecondlyForTotalCount(5);

            CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule("0/2 * * * * ?");
            // 2、创建Trigger
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1_1", "tGroup1").startNow()
                    .withSchedule(builder)
                    .build();

            // 3、创建Scheduler
            scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            // 4、调度执行
            scheduler.scheduleJob(jobDetail, trigger);

        } catch (SchedulerException e) {
            e.printStackTrace();
        }
	}
	
}

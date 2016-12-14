/** 
 * Project Name:zuul-server 
 * File Name:Application.java 
 * Package Name:com.s3s3l.springcloud.app 
 * Date:Dec 14, 20164:36:05 PM 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>
 * </p>
 * ClassName:Application <br>
 * Date: Dec 14, 2016 4:36:05 PM <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

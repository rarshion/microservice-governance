/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storm.monitor.dashboard;

import org.springframework.context.annotation.ImportResource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@ImportResource({"classpath*:META-INF/springxml/service-config.xml"})
@SpringBootApplication
public class StormMonitorDashboardApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StormMonitorDashboardApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(StormMonitorDashboardApplication.class, args);
    }
}

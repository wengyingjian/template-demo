/**
 * 
 */
package com.asd.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年12月3日
 * @since 1.1
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.asd.template" })
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}

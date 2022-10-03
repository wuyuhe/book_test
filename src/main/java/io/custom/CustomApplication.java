

package io.custom;

import io.custom.config.TaskThreadPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling//开启调度
@EnableCaching//开启缓存使用
@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class})//开启配置属性支持
@SpringBootApplication
public class CustomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomApplication.class, args);
	}

}
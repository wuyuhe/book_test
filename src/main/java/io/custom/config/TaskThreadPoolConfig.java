package io.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yuhe
 * @date 2022/9/3
 * @email yhe.wu@haihangyun.com
 * @describe
 */
@Data
@ConfigurationProperties(prefix = "task.pool")
public class TaskThreadPoolConfig {
    private int corePoolSize;
    private int maxPoolSize;
    private int keepAliveSeconds;
    private int queueCapacity;
}

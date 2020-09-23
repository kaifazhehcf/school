package cn.utlis;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 资源映射路径
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/zy/**")
          .addResourceLocations("classpath:/static/zy/");
        super.addResourceHandlers(registry);
    }
}

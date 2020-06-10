package cn.versewow.gmall.search.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import java.io.File;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    private static final String[] RESOURCE_LOCATIONS =
            { "classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/" };
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        try {

            File directiory = new File("");
            registry.addResourceHandler("/**").addResourceLocations(RESOURCE_LOCATIONS).addResourceLocations("file:" + directiory.getCanonicalPath() + "/");

        } catch (Exception e) {

        }

    }
}

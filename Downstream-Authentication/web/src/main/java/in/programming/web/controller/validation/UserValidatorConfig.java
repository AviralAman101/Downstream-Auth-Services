package in.programming.web.controller.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UserValidatorConfig implements WebMvcConfigurer {

    @Autowired
    UserMicroserviceInterceptor userMicroserviceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(userMicroserviceInterceptor);
    }
}

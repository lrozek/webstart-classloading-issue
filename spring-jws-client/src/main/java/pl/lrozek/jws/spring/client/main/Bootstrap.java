package pl.lrozek.jws.spring.client.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.lrozek.jws.spring.client.config.AppConfig;
import pl.lrozek.jws.spring.client.service.AccountService;
import pl.lrozek.jws.spring.client.service.UserService;

public class Bootstrap {

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class );
        UserService userService = applicationContext.getBean( UserService.class );
        userService.loadUser();
        AccountService accountService = applicationContext.getBean( AccountService.class );
        accountService.loadAccount();
    }

}

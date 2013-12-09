package pl.lrozek.jws.spring.client.main;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.lrozek.jws.spring.client.config.AppConfig;
import pl.lrozek.jws.spring.client.service.AccountService;
import pl.lrozek.jws.spring.client.service.UserService;

public class Bootstrap {

    public static void main( String[] args ) throws IOException {
        new Bootstrap().startup();
    }

    public void startup() throws IOException {
        findResources( "pl/lrozek/jws/spring/" );
        findResources( "org/springframework/" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class );
        UserService userService = applicationContext.getBean( UserService.class );
        userService.loadUser();
        AccountService accountService = applicationContext.getBean( AccountService.class );
        accountService.loadAccount();

    }

    private void findResources( String path ) throws IOException {
        Enumeration<URL> resources = getClass().getClassLoader().getResources( path );
        while ( resources.hasMoreElements() ) {
            URL url = resources.nextElement();
            logger.info( "found following resource: {}", url );
        }
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}

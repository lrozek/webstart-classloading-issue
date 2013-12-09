package pl.lrozek.jws.spring.client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void loadUser() {
        logger.info( "loading user" );
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}

package pl.lrozek.jws.spring.client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    public void loadAccount() {

        logger.info( "loadingAccount" );
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}

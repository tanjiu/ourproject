package com.i1314i.ourproject.shiro.realmAuthenticator;


import com.i1314i.ourproject.shiro.exception.CodeException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.realm.Realm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Iterator;

/**
 * 重写ModularRealmAuthenticator  doMultiRealmAuthentication方法
 * 解决多realm 全为AuthenticationException父异常 问题
 * @author 平行时空
 * @created 2018-09-20 23:33
 **/
public class MyModularRealmAuthenticator extends ModularRealmAuthenticator {
    private static final Logger log = LoggerFactory.getLogger(ModularRealmAuthenticator.class);

    @Override
    protected AuthenticationInfo doMultiRealmAuthentication(Collection<Realm> realms, AuthenticationToken token) {

        AuthenticationStrategy strategy = this.getAuthenticationStrategy();
        AuthenticationInfo aggregate = strategy.beforeAllAttempts(realms, token);
        if (log.isTraceEnabled()) {
            log.trace("Iterating through {} realms for PAM authentication", realms.size());
        }
        Throwable t = null;
        Iterator var5 = realms.iterator();
        while(var5.hasNext()) {
            Realm realm = (Realm)var5.next();
            aggregate = strategy.beforeAttempt(realm, token, aggregate);
            if (realm.supports(token)) {
                log.trace("Attempting to authenticate token [{}] using realm [{}]", token, realm);
                AuthenticationInfo info = null;


                try {
                    info = realm.getAuthenticationInfo(token);
                } catch (Throwable var11) {
                    t = var11;
                    if (log.isDebugEnabled()) {
                        String msg = "Realm [" + realm + "] threw an exception during a multi-realm authentication attempt:";
                        log.debug(msg, var11);
                    }
                }

                if (t != null) {
                    if (t instanceof ExcessiveAttemptsException) {
                        throw (ExcessiveAttemptsException) t;
                    } else if (t instanceof IncorrectCredentialsException) {
                        throw (IncorrectCredentialsException) t;
                    } else if (t instanceof ExpiredCredentialsException) {
                        throw (ExpiredCredentialsException) t;
                    } else if (t instanceof ConcurrentAccessException) {
                        throw (ConcurrentAccessException) t;
                    } else if (t instanceof UnknownAccountException) {
                        throw (UnknownAccountException) t;
                    } else if (t instanceof DisabledAccountException) {
                        throw (DisabledAccountException) t;
                    } else if (t instanceof LockedAccountException) {
                        throw (LockedAccountException) t;
                    } else if (t instanceof UnsupportedTokenException) {
                        throw (UnsupportedTokenException) t;
                    }else if(t instanceof CodeException){
                        throw (CodeException) t;
                    }
                }
                aggregate = strategy.afterAttempt(realm, token, info, aggregate, t);
            } else {
                log.debug("Realm [{}] does not support token {}.  Skipping realm.", realm, token);
            }
        }
        aggregate = strategy.afterAllAttempts(token, aggregate);
        return aggregate;
    }

}


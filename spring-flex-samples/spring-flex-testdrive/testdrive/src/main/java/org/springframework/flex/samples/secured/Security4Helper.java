
package org.springframework.flex.samples.secured;

import java.util.Map;

import org.springframework.flex.security4.AuthenticationResultUtils;


public class Security4Helper {

    public Map<String, Object> getAuthentication() {
        return AuthenticationResultUtils.getAuthenticationResult();
    }
}
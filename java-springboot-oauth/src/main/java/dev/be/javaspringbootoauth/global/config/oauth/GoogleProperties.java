package dev.be.javaspringbootoauth.global.config.oauth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@ConfigurationProperties("oauth.google")
@ConstructorBinding
public class GoogleProperties {
    private final String clientId;
    private final String clientSecret;
    private final String oauthEndPoint;
    private final String responseType;
    private final List<String> scopes;
    private final String tokenUri;
    private final String accessType;

    public GoogleProperties(@Value("${oauth.google.client-id}") final String clientId,
                            @Value("${oauth.google.client-secret}") final String clientSecret,
                            @Value("${oauth.google.oauth-end-point}") final String oauthEndPoint,
                            @Value("${oauth.google.response-type}") String responseType,
                            @Value("${oauth.google.scopes}") final List<String> scopes,
                            @Value("${oauth.google.token-uri}") final String tokenUri,
                            @Value("${oauth.google.access-type}") final String accessType) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oauthEndPoint = oauthEndPoint;
        this.responseType = responseType;
        this.scopes = scopes;
        this.tokenUri = tokenUri;
        this.accessType = accessType;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getOauthEndPoint() {
        return oauthEndPoint;
    }

    public String getResponseType() {
        return responseType;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public String getTokenUri() {
        return tokenUri;
    }

    public String getAccessType() {
        return accessType;
    }
}

package com.hoaxify.backend.config;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
public class WebClientConfig {

    private final static int TIMEOUT_IN_MS = 10000;

    @Bean
    @Qualifier("todoWebClient")
    public WebClient todoWebClient() {
        final HttpClient httpClient = HttpClient.create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, TIMEOUT_IN_MS)
                .responseTimeout(Duration.ofMillis(TIMEOUT_IN_MS))
                .doOnConnected(conn -> {
                    conn.addHandlerLast(new ReadTimeoutHandler(TIMEOUT_IN_MS, TimeUnit.MILLISECONDS))
                            .addHandlerLast(new WriteTimeoutHandler(TIMEOUT_IN_MS, TimeUnit.MILLISECONDS));
                });

        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .baseUrl("https://jsonplaceholder.typicode.com/todos/")
                .build();
    }
}
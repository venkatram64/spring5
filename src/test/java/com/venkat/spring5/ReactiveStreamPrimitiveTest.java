package com.venkat.spring5;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class ReactiveStreamPrimitiveTest {

    @Test
    public void shouldStreamSingleValue() throws Exception{
        Mono.just("Hello")
                .map(String :: toUpperCase)
                .doOnSubscribe(subscription -> System.out.println("==Subscribed"))
                .doOnRequest(request -> System.out.println("==Requested"))
                .doOnSuccess(complete -> System.out.println("==Stream completed"))
                .log()
                .subscribe();
    }

    @Test
    public void shouldStreamFromGenerate() throws Exception {
        Flux.just("a", "b", "c")
                .concatWith(Flux.just("d", "e", "a"))
                .distinct()
                .log()
                .subscribe();
    }

    @Test
    public void shouldStreamRepeat() throws Exception{
        Flux.fromIterable(Arrays.asList("a", "b", "c", "d"))
            .repeat(3)
            .filter("a" :: equals)
            .map(String :: toUpperCase)
            .log()
            .subscribe();
    }
}

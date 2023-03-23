package com.learn.spring.circular;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Krishna Chaitanya Surapaneni
 */

@Component
@Lazy
@RequiredArgsConstructor
public class Car {

    private final @Lazy Engine engine;

}

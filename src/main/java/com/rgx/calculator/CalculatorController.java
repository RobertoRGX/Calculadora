
package com.rgx.calculator;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/calculator")
@Slf4j
public class CalculatorController {

    private final CalculatorService service = new CalculatorServiceImpl();

    @GetMapping({ "/divide/{x}/{y}", "/divide/{x}" })
    public String divide(@PathVariable final Optional<String> x, @PathVariable final Optional<String> y) {
        return service.divide(x.orElse("0.0"), y.orElse("1.0"));
    }

    @GetMapping
    public String ini() {
        log.debug("Calculator 2023 RGX     calculator/ping");
        return "Calculator 2023 RGX     calculator/ping";
    }

    @GetMapping({ "/multi/{x}/{y}", "/multi/{x}" })
    public String multi(@PathVariable final Optional<String> x, @PathVariable final Optional<String> y) {
        return service.multi(x.orElse("0.0"), y.orElse("1.0"));
    }

    @GetMapping("/ping")
    public String ping() {
        return service.ping();
    }

    @GetMapping({ "/resta/{x}/{y}", "/resta/{x}" })
    public String resta(@PathVariable final Optional<String> x, @PathVariable final Optional<String> y) {
        return service.resta(x.orElse("0.0"), y.orElse("0.0"));
    }

    @GetMapping({ "/suma/{x}/{y}", "/suma/{x}" })
    public String suma(@PathVariable final Optional<String> x, @PathVariable final Optional<String> y) {
        return service.suma(x.orElse("0.0"), y.orElse("0.0"));
    }

}

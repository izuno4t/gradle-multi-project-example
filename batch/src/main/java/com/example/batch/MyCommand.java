package com.example.batch;

import com.example.core.service.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;


@Component
@Command(name = "myCommand")
public class MyCommand implements Callable<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(MyCommand.class);

    @Autowired
    private FooService fooService;

    // Prevent "Unknown option" error when users use
    // the Spring Boot parameter 'spring.config.location' to specify
    // an alternative location for the application.properties file.
    @Option(names = "--spring.config.location", hidden = true)
    private String springConfigLocation;

    @Option(names = {"-x", "--option"}, description = "example option")
    private boolean option;

    public Integer call() throws Exception {
        logger.info("バッチアプリケーションです。");
        logger.info(fooService.message());
        return 0;
    }
}

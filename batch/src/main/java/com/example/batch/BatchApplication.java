package com.example.batch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;
import picocli.CommandLine.IFactory;

@SpringBootApplication
public class BatchApplication implements CommandLineRunner, ExitCodeGenerator {

    private final IFactory factory; // auto-configured to inject PicocliSpringFactory
    private final MyCommand myCommand; // your @picocli.CommandLine.Command-annotated class
    private int exitCode;

    // constructor injection
    BatchApplication(final IFactory factory, final MyCommand myCommand) {
        this.factory = factory;
        this.myCommand = myCommand;
    }

    @Override
    public void run(final String... args) {
        // let picocli parse command line args and run the business logic
        exitCode = new CommandLine(myCommand, factory).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }

    public static void main(final String[] args) {
        // let Spring instantiate and inject dependencies
        System.exit(SpringApplication.exit(SpringApplication.run(BatchApplication.class, args)));
    }

}

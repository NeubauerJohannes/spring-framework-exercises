package com.bobocode;

import com.bobocode.config.AppConfig;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;

public class Main {
    private TestDataGenerator testDataGenerator;
    private AccountService accountService;

    /**
     * TODO: initialize the class variable testDataGenerator by using the Bean provided by the applicationContext
     * TODO: initialize the class variable accountService by using the Bean provided by the applicationContext
     */
    private Main(ApplicationContext applicationContext) {
    }

    private void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(testDataGenerator.generateAccount());
        }
        System.out.println("Richest Account: ");
        System.out.println(accountService.findRichestAccount());
    }

    public static void run(ApplicationContext applicationContext) {
        Main main = new Main(applicationContext);
        main.run();
    }

    /**
     * TODO: Initialize the applicationContext with the context provided by {@link AppConfig}
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext;
        Main.run(applicationContext);
    }
}

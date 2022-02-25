package com.bobocode;

import com.bobocode.config.AppConfig;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private TestDataGenerator testDataGenerator;
    private AccountService accountService;

    private Main(ApplicationContext applicationContext) {
        //TODO: initialize the variable testDataGenerator by using the Bean provided by the applicationContext
        this.testDataGenerator = applicationContext.getBean("dataGenerator", TestDataGenerator.class);
        //TODO: initialize the variable accountService by using the Bean provided by the applicationContext
        this.accountService = applicationContext.getBean("accountService", AccountService.class);
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

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Main.run(applicationContext);

    }
}

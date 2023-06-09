package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {
    @Test
    public void java_faker(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName().toLowerCase() );
        System.out.println("faker.numerify(\"###-####\") = " + faker.numerify("###-####-###"));
        System.out.println("faker.numerify(\"222-####\") = " + faker.numerify("222-####"));
        System.out.println("faker.letterify(\"????\") = " + faker.letterify("????"));
        System.out.println("faker.finance() = " + faker.finance().creditCard());
        System.out.println("faker.bothify(\"##???#\") = " + faker.bothify("##???#"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
    }
}

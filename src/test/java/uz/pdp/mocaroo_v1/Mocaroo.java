package uz.pdp.mocaroo_v1;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

/**
 * @author : Oyatjon  -> @data :4/20/2022 09:36
 */

public class Mocaroo {
    Faker faker = new Faker();
    String name = faker.name().fullName(); // Miss Samanta Schmidt
    String firstName = faker.name().firstName(); // Emory
    String lastName = faker.name().lastName(); // Barton
    String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

}

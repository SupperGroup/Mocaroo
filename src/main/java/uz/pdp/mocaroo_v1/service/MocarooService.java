package uz.pdp.mocaroo_v1.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import uz.pdp.mocaroo_v1.entity.Mocaroo;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Oyatjon  -> @data :4/20/2022 09:32
 */

@Service
public class MocarooService {
//    public static void main(String[] args) {
//        Faker faker = new Faker();
//        for (int i = 0; i < 100; i++) {
//            String name = faker.name().fullName(); // Miss Samanta Schmidt
//            String firstName = faker.name().firstName(); // Emory
//            System.out.println("firstName = " + firstName);
//            System.out.println("name = " + name);
//        }
//        String lastName = faker.name().lastName(); // Barton
//        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
//
//
//    }

    public List<Mocaroo> getData(Mocaroo mocaroo) {
        List<Mocaroo> mocaroos = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 1; i <= mocaroo.getCount(); i++) {
            Mocaroo mocaroo1 = new Mocaroo();
            mocaroo1.setId(i);

            if (mocaroo.getFirstName() != null) {
//                String name = faker.name().fullName(); // Miss Samanta Schmidt
                String firstName = faker.name().firstName(); // Emory
                mocaroo1.setFirstName(firstName);
            }
            if (mocaroo.getLastName() != null) {
                String lastName = faker.name().lastName(); // Barton
                mocaroo1.setLastName(lastName);
            }
            mocaroos.add(mocaroo1);
        }
        return mocaroos;
//        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

    }
}

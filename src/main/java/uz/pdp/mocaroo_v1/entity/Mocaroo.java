package uz.pdp.mocaroo_v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Oyatjon  -> @data :4/20/2022 10:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mocaroo {

    private Integer id;

    private String firstName;

    private String lastName;

    private Integer count;
}

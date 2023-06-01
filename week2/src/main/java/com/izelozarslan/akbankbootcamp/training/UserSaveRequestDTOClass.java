package com.izelozarslan.akbankbootcamp.training;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor // final değişken varsa
public class UserSaveRequestDTOClass {
    private final String name;
    private String surname;


}

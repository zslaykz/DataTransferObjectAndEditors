package ua.com.owu.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserProductDTO {

    private int idUser;
    private String name;
    private int age;

    private int idProduct;
    private String pName;
    private String pType;

}

package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}

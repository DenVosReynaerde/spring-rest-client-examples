package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class ExpirationDate implements Serializable {

    private String date;
    private Integer timezoneType;
    private String timezone;
}

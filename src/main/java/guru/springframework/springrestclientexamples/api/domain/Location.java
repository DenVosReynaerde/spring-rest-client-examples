package guru.springframework.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class Location implements Serializable {

    private String Street;
    private String city;
    private String state;
    private String postcode;
}

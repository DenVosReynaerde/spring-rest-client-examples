package guru.springframework.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class Name implements Serializable {

    private String title;
    private String first;
    private String last;
}

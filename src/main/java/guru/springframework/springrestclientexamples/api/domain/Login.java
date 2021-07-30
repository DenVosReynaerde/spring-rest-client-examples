package guru.springframework.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class Login implements Serializable {

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sh256;
}

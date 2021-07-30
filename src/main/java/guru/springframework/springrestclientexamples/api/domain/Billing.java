package guru.springframework.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Billing implements Serializable {

    private Card card;

}

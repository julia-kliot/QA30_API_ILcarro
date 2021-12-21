package dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Error {

    Integer code;
    String details;
    String message;

}

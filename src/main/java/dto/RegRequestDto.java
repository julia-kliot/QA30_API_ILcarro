package dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class RegRequestDto {
    String email;
    String password;
}

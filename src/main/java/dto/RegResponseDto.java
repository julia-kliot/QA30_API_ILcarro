package dto;

import lombok.*;

@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class RegResponseDto {
    Boolean registration;
    String status;
    String token;
}

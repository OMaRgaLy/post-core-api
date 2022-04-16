package kz.dar.academy.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponse {
    @NotNull
    private String postId;
    @NotNull
    private String clientId;
    @NotNull
    private String postRecipientId;
    private String postItem;
    private String status;
}

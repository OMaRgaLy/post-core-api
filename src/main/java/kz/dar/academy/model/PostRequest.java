package kz.dar.academy.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostRequest {
    @NotNull(message = "Post id can not be empty")
    private String postId;
    @NotNull(message = "Client id can not be empty")
    private String clientId;
    @NotNull(message = "Recipient id can not be empty")
    private String postRecipientId;
    private String postItem;
    private String status;
}

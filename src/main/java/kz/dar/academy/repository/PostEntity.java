package kz.dar.academy.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "post_test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true, length = 50)
    private String postId;
    @Column(unique = true, length = 50)
    private String clientId;
    @Column(unique = true, length = 50)
    private String postRecipientId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;
}

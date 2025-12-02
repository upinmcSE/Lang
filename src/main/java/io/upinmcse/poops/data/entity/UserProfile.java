package io.upinmcse.poops.data.entity;

import io.upinmcse.poops.data.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_user")
public class UserProfile extends BaseEntity{
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "bio", length = 500)
    private String bio;

    @Column(name = "avt_url")
    private String avtUrl;

    @Enumerated(EnumType.STRING)
    Status status;
}

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
@Table(name = "tb_active_code")
public class ActiveCode extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(length = 6, unique = true)
    private String code;
}

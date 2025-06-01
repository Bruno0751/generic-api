package com.dev.email.models;

import com.dev.email.enuns.StatusEmail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "email")
public class EmailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEmail;

    @Column(name = "id")
    private Long id;

    @Column(name = "emailFrom")
    private String emailFrom;

    @NotBlank(message = "O campo 'emailTo' não pode ser vazio. Por favor, forneça um valor válido.")
    @Column(name = "emailTo", nullable = false)
    private String emailTo;

    @NotBlank(message = "O campo 'subject' não pode ser vazio. Por favor, forneça um valor válido.")
    @Column(name = "subject", nullable = false)
    private String subject;

    @NotBlank(message = "O campo 'text' não pode ser vazio. Por favor, forneça um valor válido.")
    @Column(name = "text", nullable = false, columnDefinition = "TEXT")
    private String text;

    @Column(name = "sendDataTime")
    private LocalDateTime sendDataTime;

    @Column(name = "statusEmail")
    private StatusEmail statusEmail;
}

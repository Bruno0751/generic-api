package com.dev.email.dtos;

import java.util.UUID;

public record EmailRecordDto(Long idFregues, String emailTo, String subject, String text) {
}

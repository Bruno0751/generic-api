package com.dev.email.dtos;

import java.util.UUID;

public record EmailRecordDto(Long id, String emailTo, String subject, String text) {
}

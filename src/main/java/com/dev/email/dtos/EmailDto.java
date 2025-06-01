package com.dev.email.dtos;

public record EmailDto(Long id, String emailTo, String subject, String text) {
}

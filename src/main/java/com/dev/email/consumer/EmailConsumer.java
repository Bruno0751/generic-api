package com.dev.email.consumer;

import com.dev.email.dtos.EmailRecordDtoLong;
import com.dev.email.models.EmailModel;
import com.dev.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDtoLong emailRecordDtolong) {
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordDtolong, emailModel);
        emailService.sendEmail(emailModel);
    }
}

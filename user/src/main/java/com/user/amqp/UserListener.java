package com.user.amqp;


import com.user.resources.dto.UploadMusica;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class UserListener {


    @RabbitListener(queues = "${rabbit-queue-upload}")
    public void recebeMusica(@Payload UploadMusica uploadMusica) {

    }
}

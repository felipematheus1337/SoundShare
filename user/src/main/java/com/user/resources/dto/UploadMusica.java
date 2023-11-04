package com.user.resources.dto;


import lombok.*;

import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UploadMusica {

    public String nomeMusica;

    public String autor;

    public String url;

    public String genero;

    public Long tamanho;

    public Calendar dataUpload;
}

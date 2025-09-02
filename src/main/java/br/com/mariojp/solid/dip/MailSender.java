package br.com.mariojp.solid.dip;

public interface MailSender {
    void enviar(String to, String subject, String body);
}

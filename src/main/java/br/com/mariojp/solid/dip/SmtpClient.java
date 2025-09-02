package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender{
    @Override
    public void enviar(String to, String subject, String body) {
        System.out.println("Enviando e-mail de verdade para: " + to);
        System.out.println("Assunto: " + subject);
        System.out.println("Corpo: " + body);
    }
}

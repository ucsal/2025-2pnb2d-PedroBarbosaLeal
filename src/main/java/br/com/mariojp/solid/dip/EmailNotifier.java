package br.com.mariojp.solid.dip;

public class EmailNotifier {

	private final MailSender mailSender;

	public EmailNotifier() {
		this(new SmtpClient());
	}

    public EmailNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void welcome(User user) {
		if (!"true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			mailSender.enviar(user.email(), "Bem-vindo", "Olá " + user.name());
		}
	}


}

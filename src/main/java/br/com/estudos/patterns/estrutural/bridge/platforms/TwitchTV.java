package br.com.estudos.patterns.estrutural.bridge.platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizando a Aplicação.");
    }

}

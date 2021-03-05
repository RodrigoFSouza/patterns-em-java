package br.com.estudos.patterns.estrutural.bridge.platforms;

public class YouTube implements IPlatform {

    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: configuraando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando a Aplicação.");
    }

}

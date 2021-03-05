package br.com.estudos.patterns.estrutural.bridge.platforms;

public class DisneyPlus implements IPlatform {

    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando a Aplicação.");
    }
}

package br.com.estudos.patterns.estrutural.bridge.trasmissions;

import br.com.estudos.patterns.estrutural.bridge.platforms.IPlatform;

public class RecordLive extends Live {

    public RecordLive(IPlatform platform) {
        super(platform);
    }

    public void startRecord() {
        System.out.println("Iniciando a gravação da Live");
    }

    public void stopRecord() {
        System.out.println("Parando a gravação da Live");
    }
}

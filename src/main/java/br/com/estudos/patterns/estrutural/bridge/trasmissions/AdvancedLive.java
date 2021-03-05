package br.com.estudos.patterns.estrutural.bridge.trasmissions;

import br.com.estudos.patterns.estrutural.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na transmissão.");
    }

    public void comments() {
        System.out.println("Comentarios liberados na live");
    }
}

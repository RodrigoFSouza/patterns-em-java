package br.com.estudos.patterns.estrutural.bridge;

import br.com.estudos.patterns.estrutural.bridge.platforms.Facebook;
import br.com.estudos.patterns.estrutural.bridge.platforms.IPlatform;
import br.com.estudos.patterns.estrutural.bridge.platforms.TwitchTV;
import br.com.estudos.patterns.estrutural.bridge.platforms.YouTube;
import br.com.estudos.patterns.estrutural.bridge.trasmissions.AdvancedLive;
import br.com.estudos.patterns.estrutural.bridge.trasmissions.Live;
import br.com.estudos.patterns.estrutural.bridge.trasmissions.RecordLive;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    private void startLive(IPlatform platform) {
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }

    private void startLiveAvancada(IPlatform platform) {
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }

    private void startLiveComGravacao(IPlatform platform) {
        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.startRecord();
        recordLive.stopRecord();
        recordLive.result();
    }

    @Test
    public void deveIniciarUmaLive() {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    @Test
    public void deveIniciarUmaLiveAvancada() {
        startLiveAvancada(new YouTube());
        startLiveAvancada(new TwitchTV());
        startLiveAvancada(new Facebook());
    }

    @Test
    public void deveIniciarUmaLiveComGravacao() {
        startLiveComGravacao(new YouTube());
        startLiveComGravacao(new TwitchTV());
        startLiveComGravacao(new Facebook());
    }
}

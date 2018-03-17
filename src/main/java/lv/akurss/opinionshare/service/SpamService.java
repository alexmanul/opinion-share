package lv.akurss.opinionshare.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SpamService {

    private static final Logger log = LoggerFactory.getLogger(SpamService.class);

    @Scheduled(fixedRate = 10000)
    public void sendSpam() {
        log.info("Scheduler works");
    }
}

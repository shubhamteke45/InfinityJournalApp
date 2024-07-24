package net.infinity.infinityJournalApp.cache;

import jakarta.annotation.PostConstruct;
import net.infinity.infinityJournalApp.entity.ConfigJournalAppEntity;
import net.infinity.infinityJournalApp.repository.ConfigJournalAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    public Map<String, String> appCache;

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    @PostConstruct
    public void init(){
        appCache = new HashMap<>();
        List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
        for(ConfigJournalAppEntity configJournalAppEntity: all){
            appCache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
        }
    }
}

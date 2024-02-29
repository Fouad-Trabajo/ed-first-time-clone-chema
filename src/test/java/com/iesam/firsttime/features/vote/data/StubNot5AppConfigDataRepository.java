package com.iesam.firsttime.features.vote.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class StubNot5AppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(1);
    }

    /**
     * Este valor puede ser cualquier valor siempre y cuando sea distinto de 5
     * que son las veces que hemos establecido para que se muestre el mensaje de votación
     */

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}

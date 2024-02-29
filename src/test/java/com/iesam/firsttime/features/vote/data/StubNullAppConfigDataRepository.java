package com.iesam.firsttime.features.vote.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class StubNullAppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return null;
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}

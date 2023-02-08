package com.adiuvo.illuminate2.realm;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;
/**
 * All calls to the DB will be made here this will be the reusable part of the code that we import into all projects
 * */
public class Repository {
    Context mContext;

    public Repository(Context context) {
        String realmName = "My Project";
        RealmConfiguration config = new RealmConfiguration.Builder().name(realmName).build();
        Realm backgroundThreadRealm = Realm.getInstance(config);
    }
}

package com.hitherejoe.tabby.injection.component;

import android.app.Application;

import com.hitherejoe.tabby.injection.module.ApplicationModule;
import com.hitherejoe.tabby.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    Application application();
}
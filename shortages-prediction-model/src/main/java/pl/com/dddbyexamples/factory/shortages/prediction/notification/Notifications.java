package pl.com.dddbyexamples.factory.shortages.prediction.notification;

import pl.com.dddbyexamples.factory.shortages.prediction.Shortage;

/**
 * Created by michal on 02.02.2017.
 */
interface Notifications {
    void alertPlanner(Shortage shortage);

    void softNotifyPlanner(Shortage shortage);

    void markOnPlan(Shortage shortage);
}

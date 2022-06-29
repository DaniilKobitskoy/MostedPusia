package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5;

import android.app.Application;

import com.onesignal.OneSignal;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class layout_activity_parametrtrafics_number_one extends Application {
    private static final String ONESIGNAL_APP_ID = "53a75afd-f678-4599-afd4-556d7413c9dd";
    private static final String YANDEXMETRICA_ID = "f8c8cfec-1524-441a-b82f-8fd64fc4d39a";

    @Override
    public void onCreate() {
        super.onCreate();

        try{
            // Initializing the AppMetrica SDK.
            YandexMetrica.activate(getApplicationContext(), YandexMetricaConfig.fromJson(YANDEXMETRICA_ID));
            // Automatic tracking of user activity.
            YandexMetrica.enableActivityAutoTracking(this);
            // Enable verbose OneSignal logging to debug issues if needed.
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

            // OneSignal Initialization
            OneSignal.initWithContext(this);
            OneSignal.setAppId(ONESIGNAL_APP_ID);
        }catch (Exception e){

        }

main();
    }

    private void main() {
       Integer cal = 3;
       Integer call = 4;
        Integer rezultat = call-cal;
    }
}
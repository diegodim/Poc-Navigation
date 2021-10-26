package duarte.diego.pocnavigation

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import duarte.diego.pocnavigation.di.intent.intentModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


@Suppress("unused")
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        startKoin {
            modules(
                intentModule

            ).androidContext(applicationContext)
        }
    }
}

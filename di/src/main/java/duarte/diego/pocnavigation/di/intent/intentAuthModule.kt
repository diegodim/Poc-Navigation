package duarte.diego.pocnavigation.di.intent

import androidx.fragment.app.Fragment
import duarte.diego.pocnavigation.auth.navigation.AuthNavigation
import duarte.diego.pocnavigation.auth.navigation.LoginNavigation
import duarte.diego.pocnavigation.auth.navigation.RegisterNavigation
import duarte.diego.pocnavigation.intent.navigation.AuthNavigationImpl
import duarte.diego.pocnavigation.intent.navigation.LoginNavigationImpl
import duarte.diego.pocnavigation.intent.navigation.RegisterNavigationImpl
import org.koin.dsl.module

val intentAuthModule = module {

    factory<AuthNavigation> {
        AuthNavigationImpl()
    }

    factory<LoginNavigation> { (fragment: Fragment) ->
        LoginNavigationImpl(fragment)
    }

    factory<RegisterNavigation> { (fragment: Fragment) ->
        RegisterNavigationImpl(fragment)
    }
}

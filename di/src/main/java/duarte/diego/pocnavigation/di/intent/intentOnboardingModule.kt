package duarte.diego.pocnavigation.di.intent

import androidx.fragment.app.Fragment
import duarte.diego.pocnavigation.intent.navigation.DashboardNavigationImpl
import duarte.diego.pocnavigation.onboarding.navigation.DashboardNavigation
import org.koin.dsl.module

val intentOnboardingModule = module {


    factory<DashboardNavigation>{ (fragment: Fragment) ->
        DashboardNavigationImpl(fragment)
    }

}
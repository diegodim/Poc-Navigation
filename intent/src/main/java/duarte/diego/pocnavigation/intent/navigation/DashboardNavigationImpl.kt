package duarte.diego.pocnavigation.intent.navigation

import androidx.fragment.app.Fragment
import duarte.diego.pocnavigation.intent.navigate
import duarte.diego.pocnavigation.onboarding.fragment.DashboardFragmentDirections
import duarte.diego.pocnavigation.onboarding.navigation.DashboardNavigation

class DashboardNavigationImpl(private val fragment: Fragment) : DashboardNavigation {

    override fun navigateToAuth() =
        fragment.navigate(DashboardFragmentDirections.actionDashboardFragmentToAuthActivity())

}
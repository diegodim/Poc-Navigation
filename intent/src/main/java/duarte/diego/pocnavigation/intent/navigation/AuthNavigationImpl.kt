package duarte.diego.pocnavigation.intent.navigation

import androidx.navigation.NavController
import duarte.diego.pocnavigation.auth.navigation.AuthNavigation
import duarte.diego.pocnavigation.intent.R

class AuthNavigationImpl: AuthNavigation {
    override fun setNavGraph(navController: NavController) {
        navController.setGraph(R.navigation.auth_navigation)
    }

}
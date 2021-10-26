package duarte.diego.pocnavigation.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import duarte.diego.pocnavigation.auth.navigation.AuthNavigation
import org.koin.core.component.KoinComponent

class AuthActivity : AppCompatActivity() {

    private lateinit var mNavController: NavController

    private val navigation: AuthNavigation by navDirections()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.authNavHostFragment) as NavHostFragment
        mNavController = navHostFragment.navController

        navigation.setNavGraph(mNavController)

        NavigationUI.setupActionBarWithNavController(this, mNavController)
    }

    override fun onSupportNavigateUp() = mNavController.navigateUp()
}
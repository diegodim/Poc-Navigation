package duarte.diego.pocnavigation.intent.navigation

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import duarte.diego.pocnavigation.auth.fragment.LoginFragmentDirections
import duarte.diego.pocnavigation.auth.navigation.LoginNavigation
import duarte.diego.pocnavigation.intent.addOnBackPressedCallback
import duarte.diego.pocnavigation.intent.navigate

class LoginNavigationImpl(private val fragment: Fragment) : LoginNavigation {
    override fun navigateToRegister() = fragment.navigate(
        LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
    )

    override fun onBackPressed(owner: LifecycleOwner, onBackPressed: () -> Unit) =
        fragment.addOnBackPressedCallback(owner, onBackPressed)

}
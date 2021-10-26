package duarte.diego.pocnavigation.auth.navigation

import androidx.lifecycle.LifecycleOwner

interface LoginNavigation {

    fun navigateToRegister()
    fun onBackPressed(owner: LifecycleOwner, onBackPressed: () -> Unit)
}

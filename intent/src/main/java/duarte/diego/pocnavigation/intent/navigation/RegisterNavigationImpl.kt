package duarte.diego.pocnavigation.intent.navigation

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import duarte.diego.pocnavigation.auth.navigation.RegisterNavigation
import duarte.diego.pocnavigation.intent.R
import duarte.diego.pocnavigation.intent.addOnBackPressedCallback

class RegisterNavigationImpl(private val fragment: Fragment): RegisterNavigation {

    override fun overrideNavigateBack(owner: LifecycleOwner) {
        fragment.addOnBackPressedCallback(owner) {
            fragment.findNavController().popBackStack(R.id.loginFragment, false)
        }
    }
}
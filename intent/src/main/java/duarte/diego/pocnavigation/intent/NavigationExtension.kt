package duarte.diego.pocnavigation.intent

import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

fun Fragment.navigate(directions: NavDirections, navOptions: NavOptions? = null) =
    findNavController().navigate(directions, navOptions)

fun Fragment.addOnBackPressedCallback(owner: LifecycleOwner, onBackPressed: () -> Unit) {
    (requireActivity() as? AppCompatActivity)?.onBackPressedDispatcher?.addCallback(
        owner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        }
    )
}


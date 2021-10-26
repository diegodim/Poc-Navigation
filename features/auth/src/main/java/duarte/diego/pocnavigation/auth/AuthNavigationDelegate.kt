package duarte.diego.pocnavigation.auth

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

inline fun <F : Fragment, reified V : Any> F.navDirections() = inject<V> {
    parametersOf(this)
}

inline fun <A : AppCompatActivity, reified V : Any> A.navDirections() = inject<V> {
    parametersOf(this)
}
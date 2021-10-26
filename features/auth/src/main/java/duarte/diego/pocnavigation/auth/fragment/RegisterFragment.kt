package duarte.diego.pocnavigation.auth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import duarte.diego.pocnavigation.auth.R
import duarte.diego.pocnavigation.auth.navDirections
import duarte.diego.pocnavigation.auth.navigation.LoginNavigation
import duarte.diego.pocnavigation.auth.navigation.RegisterNavigation


class RegisterFragment : Fragment() {

    private val navigation: RegisterNavigation by navDirections()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        navigation.overrideNavigateBack(viewLifecycleOwner)
        return inflater.inflate(R.layout.fragment_register, container, false)

    }

}
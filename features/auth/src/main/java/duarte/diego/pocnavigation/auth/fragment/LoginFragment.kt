package duarte.diego.pocnavigation.auth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import duarte.diego.pocnavigation.auth.databinding.FragmentLoginBinding
import duarte.diego.pocnavigation.auth.navDirections
import duarte.diego.pocnavigation.auth.navigation.LoginNavigation


class LoginFragment : Fragment() {

    private val navigation: LoginNavigation by navDirections()

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = FragmentLoginBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            loginButton.setOnClickListener {
                navigation.navigateToRegister()
            }
        }
    }
}
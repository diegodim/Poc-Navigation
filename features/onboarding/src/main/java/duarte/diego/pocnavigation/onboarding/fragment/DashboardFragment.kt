package duarte.diego.pocnavigation.onboarding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import duarte.diego.pocnavigation.onboarding.databinding.FragmentDashboardBinding
import duarte.diego.pocnavigation.onboarding.navDirections
import duarte.diego.pocnavigation.onboarding.navigation.DashboardNavigation

class DashboardFragment : Fragment() {

    private val navigation: DashboardNavigation by navDirections()

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = FragmentDashboardBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            dashboardButton.setOnClickListener {
                navigation.navigateToAuth()
            }
        }

    }

}
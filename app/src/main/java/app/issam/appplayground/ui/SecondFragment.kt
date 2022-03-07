package app.issam.appplayground.ui

import androidx.navigation.fragment.findNavController
import app.issam.appplayground.R
import app.issam.appplayground.core.BaseFragment
import app.issam.appplayground.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding>(FragmentSecondBinding::inflate) {
    override fun onViewCreated() {
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)

            // Ou si t'as activé safeargs
            // findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment())
        }
    }

}
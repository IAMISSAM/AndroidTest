package app.issam.appplayground.ui

import androidx.navigation.fragment.findNavController
import app.issam.appplayground.core.BaseFragment
import app.issam.appplayground.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>(FragmentFirstBinding::inflate) {

    override fun onViewCreated() {
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(123))
        }
    }
}
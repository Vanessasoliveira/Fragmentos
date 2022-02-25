package br.edu.ifsp.scl.sdm.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.edu.ifsp.scl.sdm.fragmentos.databinding.FragmentSettingsBinding

class SettingsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false)

        fragmentSettingsBinding.fecharFragmentoBt.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()

        }

        return fragmentSettingsBinding.root
    }
}
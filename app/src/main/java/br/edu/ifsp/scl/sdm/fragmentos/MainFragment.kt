package br.edu.ifsp.scl.sdm.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import br.edu.ifsp.scl.sdm.fragmentos.databinding.FragmentMainBinding


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)

               fragmentMainBinding.fecharAppBt.setOnClickListener {
            activity?.finish()
        }
        return fragmentMainBinding.root

}
}



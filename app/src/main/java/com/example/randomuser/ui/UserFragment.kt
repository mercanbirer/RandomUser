package com.example.randomuser.ui

import android.os.Bundle
import android.view.View
import com.example.randomuser.R
import com.example.randomuser.base.BaseFragment
import com.example.randomuser.databinding.FragmentUserBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.FlowPreview

@AndroidEntryPoint
@FlowPreview
class UserFragment : BaseFragment<FragmentUserBinding>(R.layout.fragment_user) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
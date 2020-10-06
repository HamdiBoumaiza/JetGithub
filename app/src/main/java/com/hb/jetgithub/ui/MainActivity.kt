package com.hb.jetgithub.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.hb.jetgithub.ui.theme.JetGithubTheme
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentViewFromCompose()
        viewModel.getListUsers()
        initObservers()

    }

    private fun initObservers() {
        viewModel.viewState.observe(this, {
            when (it) {
                is MainActivityViewState.Success<*> -> {
                    Timber.e(it.data.toString())
                    Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
                }
                is MainActivityViewState.Error -> {
                    Toast.makeText(this, it.error, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun setContentViewFromCompose() {
        setContent {
            JetGithubTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    mainScreen()
                }
            }
        }
    }

}
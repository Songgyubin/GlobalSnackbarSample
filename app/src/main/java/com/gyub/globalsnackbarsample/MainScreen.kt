package com.gyub.globalsnackbarsample

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun MainScreen(modifier: Modifier = Modifier, navigateToSub: () -> Unit) {
    Box(modifier = modifier.fillMaxSize()) {
        val scope = rememberCoroutineScope()
        Text(
            modifier = Modifier
                .background(Color.Red)
                .align(Alignment.TopCenter)
                .clickable {
                    scope.launch {
                        SnackbarController.sendEvent(
                            SnackbarEvent(message = "메인 화면 스낵바")
                        )
                    }
                },
            text = "메인 화면 스낵바",
            color = Color.Blue,
            fontSize = 30.sp
        )

        Text(
            modifier = Modifier
                .background(Color.Red)
                .align(Alignment.Center)
                .clickable { navigateToSub() },
            text = "서브 화면 이동",
            color = Color.Blue,
            fontSize = 30.sp
        )
    }
}
package com.gyub.globalsnackbarsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SubViewModel : ViewModel() {

    fun showSnackbar() {
        viewModelScope.launch {
            SnackbarController.sendEvent(
                SnackbarEvent(
                    message = "서브 화면 스낵바",
                    action = SnackbarAction(
                        name = "서브 화면 스낵바 액션",
                        action = {
                            SnackbarController.sendEvent(
                                SnackbarEvent(
                                    message = "스낵바를 클릭했습니다.",
                                )
                            )
                        }
                    ))
            )
        }
    }
}
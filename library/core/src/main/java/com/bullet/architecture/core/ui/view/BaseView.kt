package com.bullet.architecture.core.ui.view

import com.bullet.architecture.core.ui.view.model.TextProvider
import com.bullet.architecture.domain.entities.failure.Failure

interface BaseView {
    fun displayError(failure: Failure)

    fun showMessage(textProvider: TextProvider)
}
package com.bullet.architecture.core.controller

import com.bullet.architecture.core.router.command.Command
import com.bullet.architecture.core.ui.view.model.TextProvider
import com.bullet.architecture.domain.entities.failure.Failure

interface Controller {
    fun showMessage(message: TextProvider)

    fun setLoading(boolean: Boolean)

    fun navigate(command: Command)

    fun handleFailure(failure: Failure)

}
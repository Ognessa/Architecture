package com.bullet.architecture.core.provider

import com.bullet.architecture.core.coroutine.CoroutineLauncher

interface CoroutineProvider {
    val launcher: CoroutineLauncher
}
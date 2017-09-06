package de.geniusatwork.robse.template.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import de.geniusatwork.robse.template.App

object DesktopLauncher {
    @JvmStatic fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.title = "Template"
        config.width = 1920
        config.height = 1080
        LwjglApplication(App(), config)
    }
}

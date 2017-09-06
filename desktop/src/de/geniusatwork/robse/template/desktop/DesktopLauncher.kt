package de.geniusatwork.robse.template.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import de.geniusatwork.robse.template.App

object DesktopLauncher {
    @JvmStatic fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.title = "Template"
        config.width = GameInfo.screenWidth
        config.height = GameInfo.screenHeight
        LwjglApplication(App(), config)
    }
}

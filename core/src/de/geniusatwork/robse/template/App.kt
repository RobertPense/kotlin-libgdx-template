package de.geniusatwork.robse.uniwars

import com.badlogic.gdx.Game
import de.geniusatwork.robse.uniwars.infrastructure.GameContext
import de.geniusatwork.robse.uniwars.infrastructure.start.UniwarsStarter


class Uniwars() : Game() {

    override fun create() {
        GameContext.initializeGameContext(this)
        UniwarsStarter.startUniwars()
    }
}

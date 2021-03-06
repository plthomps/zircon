package org.hexworks.zircon.api.game

import org.hexworks.zircon.api.component.Component
import org.hexworks.zircon.api.data.Block
import org.hexworks.zircon.api.data.Tile
import org.hexworks.zircon.internal.behavior.Scrollable3D

interface GameComponent<T: Tile, B : Block<T>> : Component

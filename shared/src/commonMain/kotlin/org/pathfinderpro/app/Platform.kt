package org.pathfinderpro.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
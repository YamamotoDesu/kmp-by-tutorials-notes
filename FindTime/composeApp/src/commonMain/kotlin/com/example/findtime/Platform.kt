package com.example.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
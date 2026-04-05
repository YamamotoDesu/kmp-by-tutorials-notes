package com.example.firsttime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
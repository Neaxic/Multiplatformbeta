package com.example.multiplatformbeta

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
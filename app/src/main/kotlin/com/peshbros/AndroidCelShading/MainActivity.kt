package com.peshbros.AndroidCelShading

import android.app.Activity
import android.os.Bundle
import android.view.Window
import android.opengl.GLSurfaceView

import assimp.Importer;

class MainActivity : Activity() {

    private lateinit var glView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        glView = PeshGLSurfaceView(this)
        setContentView(glView)

        val scene = Importer().readFile("models/simple.assbin");
    }
}
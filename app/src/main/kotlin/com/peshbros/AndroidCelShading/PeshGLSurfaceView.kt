package com.peshbros.AndroidCelShading

import android.content.Context
import android.opengl.GLSurfaceView

import com.peshbros.AndroidCelShading.Renderer.PeshGLRenderer

class PeshGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val renderer: PeshGLRenderer

    init {

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        renderer = PeshGLRenderer()

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)

        // Render the view only when there is a change in the drawing data
        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }
}
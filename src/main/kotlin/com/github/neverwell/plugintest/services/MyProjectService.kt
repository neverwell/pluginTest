package com.github.neverwell.plugintest.services

import com.intellij.openapi.project.Project
import com.github.neverwell.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

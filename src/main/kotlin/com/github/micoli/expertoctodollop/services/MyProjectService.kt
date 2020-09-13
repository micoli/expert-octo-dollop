package com.github.micoli.expertoctodollop.services

import com.intellij.openapi.project.Project
import com.github.micoli.expertoctodollop.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

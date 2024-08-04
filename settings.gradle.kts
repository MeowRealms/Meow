pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "meow"
for (name in listOf("Meow-API", "Meow-Server", "paper-api-generator")) {
    val projName = name.lowercase()
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
    println(file(name).path)
}
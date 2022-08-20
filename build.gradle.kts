plugins {
    id("org.jetbrains.intellij") version "1.8.0"
}

group = "com.yash"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.3.3")
}
tasks {
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    patchPluginXml {
        sinceBuild.set("213")
        untilBuild.set("223.*")
    }

    patchPluginXml {
    }
}

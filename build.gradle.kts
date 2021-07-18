plugins {
    java
    `maven-publish`
}

group = "com.anatawa12.jbsdiff"
version = property("version").toString()

java {
    sourceCompatibility = JavaVersion.VERSION_1_6
    targetCompatibility = JavaVersion.VERSION_1_6
}

publishing.publications.create<MavenPublication>("maven") {
    from(components["java"])
    pom {
        name.set("jbsdiff")
        description.set("anatawa12's fork of jbsdiff")
        url.set("https://github.com/anatawa12/jbsdiff#readme")
        licenses {
            license {
                name.set("BSD 2-Clause License")
                url.set("https://opensource.org/licenses/BSD-2-Clause")
            }
        }
        developers {
            developer {
                id.set("malensek")
                name.set("malensek")
                email.set("matt@malensek.net")
            }
            developer {
                id.set("anatawa12")
                name.set("anatawa12")
                email.set("anatawa12@icloud.com")
            }
        }
        scm {
            connection.set("scm:git:git://github.com/anatawa12/jbsdiff.git")
            developerConnection.set("scm:git:ssh://github.com:anatawa12/jbsdiff.git")
            url.set("https://github.com/anatawa12/jbsdiff")
        }
    }
}

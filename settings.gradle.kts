rootProject.name = "AvtTestDz1.1"
include("src:test:java")
findProject(":src:test:java")?.name = "java"

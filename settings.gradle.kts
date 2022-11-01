include(":demo")

include(":data")
include(":domain")
include(":core")

project(":demo").projectDir = File(rootDir, "demos/main")

project(":core").projectDir = File(rootDir, "library/core")
project(":domain").projectDir = File(rootDir, "library/domain")
project(":data").projectDir = File(rootDir, "library/data")

rootProject.name = "Architecture"

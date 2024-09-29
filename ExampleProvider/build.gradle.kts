dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
}
// use an integer for version numbers
version = -1


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Test provider ohyeah"
    authors = listOf("Spess69")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    tvTypes = listOf("Movie")

    requiresResources = true
    language = "en"

    // random cc logo i found
    iconUrl = "https://i1.sndcdn.com/avatars-000869639821-nnglrd-t240x240.jpg"
}

android {
    buildFeatures {
        viewBinding = true
    }
}

`` dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://www.jitpack.io' }
		}
	} ``

``
dependencies {
		implementation 'com.github.User:Repo:Tag'
	}
``
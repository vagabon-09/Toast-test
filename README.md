> step 1. 

``

dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  ***
		repositories {
			mavenCentral()
			maven { url 'https://www.jitpack.io' }
		}
	} 
 ``

> step 2.
``

dependencies {
***
		implementation 'com.github.User:Repo:Tag'
	}
``

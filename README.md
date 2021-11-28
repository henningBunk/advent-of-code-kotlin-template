# TODO
* [ ] create a template repo
* [ ] explain how to run the tests

## Setup the automatic input download
The setup process differs depending on how you are planning to execute your solutions:
1. Via gradle from the command line
2. Via the ▶️ run button in IntelliJ

### 0. Determine your session cookie
* Open [adventofcode.com](https://adventofcode.com) in your browser
* Login
* Open the developer tools
* Open the storage tab
* Select "Cookies" → "https://adventofcode.com"
* A table will open, the row with the name "session" is the correct one, the session cookie is the string in the "Value" field

### 1. Via gradle from the command line
#### Setup (only needed once)
1. Create the file `./gradle.properties`
2. Insert the line `sessionCookie=yourSessionCookieWithoutQuotes`
#### Execution for a day
Execute `./gradlew run --args={day number}`

> Alternatively you could skip the setup and pass the cookie as a parameter: `./gradlew run --args="{day number} {session cookie}"`

### 2. Via the ▶️ run button in IntelliJ
1. Open one of the `Day{XY}.kt` files
2. Click the play button next to the `main` function, select `Modify run configuration`
3. Insert your session cookie into the field `Program arguments`
4. Execute the day by clicking the run button again and select `Run`

You have to repeat this for each day. Or you edit your run configuration each day to execute a different main function.

## Tests
Tests are prepared. They are written with [KoTest](https://kotest.io/).  
Please make sure to install the KoTest IntelliJ Idea plugin from the plugin repository in the settings.  
For KoTests API have a look into the [documentation](https://kotest.io/docs/framework/framework.html) and the [assertions](https://kotest.io/docs/assertions/assertions.html).

If you need to mock something, [MockK](https://mockk.io/) is ready to go.

You can execute the tests with one of these options:
* Clicking the play button next to the test class or method (KoTest plugin required)
* Selecting and running the according run configuration
* Executing `./gradlew :app:test --tests "day{XY}.Day{XY}Test"`
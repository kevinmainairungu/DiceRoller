# Android Dice Game


Minimalist Android app that lets you play a dice game by rolling a dice.

## Some key Lessons Learnt and Links to the resources

* layout inflation - https://developer.android.com/reference/android/app/Activity.html#setContentView(int)

Screenshot

![Alt text](ScreenShots/Screenshot_1586441584.png?raw=true "Dice")


## Structure

* `build.gradle` - root gradle config file
* `settings.gradle` - root gradle settings file
* `app` - our only project in this repo
* `app/build.gradle` - project gradle config file
* `app/src` - main project source directory
* `app/src/main` - main project flavour
* `app/src/main/AndroidManifest.xml` - manifest file
* `app/src/main/java` - java source directory
* `app/src/main/res` - resources directory

## Building

It is recommended that you run Gradle with the `--daemon` option, as starting
up the tool from scratch often takes at least a few seconds. You can kill the
java process that it leaves running once you are done running your commands.

Tasks work much like Make targets, so you may concatenate them. Tasks are not
re-done if multiple targets in a single command require them. For example,
running `assemble install` will not compile the apk twice even though
`install` depends on `assemble`.

#### Clean

	gradle clean

#### Debug

This compiles a debugging apk in `build/outputs/apk/` signed with a debug key,
ready to be installed for testing purposes.

	gradle assembleDebug

You can also install it on your attached device:

	gradle installDebug

#### Release

This compiles an unsigned release (non-debugging) apk in `build/outputs/apk/`.
It's not signed, you must sign it before it can be installed by any users.

	gradle assembleRelease

#### Test

Were you to add automated java tests, you could configure them in your
`build.gradle` file and run them within gradle as well.

	gradle test

#### Lint

This analyses the code and produces reports containing warnings about your
application in `build/outputs/lint/`.

	gradle lint

## Further reading

* [Build System Overview](https://developer.android.com/sdk/installing/studio-build.html)
* [Gradle Plugin User Guide](http://tools.android.com/tech-docs/new-build-system/user-guide)
* [Gradle Plugin Release Notes](http://tools.android.com/tech-docs/new-build-system)
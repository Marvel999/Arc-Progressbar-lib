<h1 align="center">  Arc Progressbar In Android</h1>

<p align="center">
ArcProgressbar project let create Arc progressbar in android in simplest way.
</p>
</br>
<p align="center">
  <a href="https://github.com/sparrow007/CarouselRecyclerview/actions"><img alt="Build Status"src="https://github.com/sparrow007/CarouselRecyclerview/workflows/Android%20CI/badge.svg"/></a> 
	  <a href="https://marvel999.medium.com/how-to-create-arcprogressbar-in-android-kotlin-ce4eb09d0d93"><img alt="Medium" src="https://skydoves.github.io/badges/Story-Medium.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="http://developer.android.com/index.html"><img alt="License" src="https://img.shields.io/badge/platform-android-green.svg"/></a>
    <a href="https://android-arsenal.com/api?level=14"><img alt="License" src="https://img.shields.io/badge/API-14%2B-brightgreen.svg"/></a>
    <a href="https://mailchi.mp/kotlinweekly/kotlin-weekly-242"><img alt="AndroidWeekly" src="https://skydoves.github.io/badges/kotlin-weekly.svg"/></a>

</p>
</br>

![Arcprogressbar](https://user-images.githubusercontent.com/43094705/116447605-cd10c380-a875-11eb-8d70-4743cd0dbc0c.png)
</br>

USAGE
-----
To make a Arc Progressbar add ArcProgressbar in your layout XML and add ArcProgressbar library in your project or you can also grab it through Gradle:

Gradle
------
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency
```

dependencies {
    ...
    implementation 'com.github.Marvel999:Arc-Progressbar-lib:1.0.0'
}
```


XML
-----

```xml
<!-- <a> Arc progressbar xml</a> -->

         <com.marvel999.acr.ArcProgress
             android:id="@+id/arc_img"
             android:layout_width="wrap_content"
             android:layout_height="wrap_content"
             app:ap_background_progressbar_width="20"
             app:ap_foreground_progressbar_width="20"
             app:ap_progress="50"
             app:ap_progress_background_color="#EDEDED"
             app:ap_progress_color="#71CC75"
              />

```
You may use the following properties in your XML to change your ArcProgressbar.

#####Properties:


/* Arc progressbar xml */

* app:ap_background_progressbar_width           (Integer)  -> default 5
* app:ap_foreground_progressbar_width           (Integer)  -> default 40
* app:ap_progress                               (Integer)  -> default 0
* app:ap_progress_background_color              (Color)    -> default Color #F9F9FA
* app:ap_progress_color                         (Color)    -> default Color #71CC75
* app:ap_progress_roundedCorner                 (Boolean)  -> default flase
* app:ap_progress_isClockwise                   (Boolean)  -> default true
* app:ap_progress_maxscale                      (Integer)  -> default 100

Kotlin
-----

```kotlin

val arc_img:ArcProgress=findViewById(R.id.arc_img)
        arc_img.setColor(R.color.white)
        arc_img.setProgressThickness(50f)
        arc_img.setProgressBackgroundColor(Color.CYAN)
        arc_img.setProgressColor(Color.YELLOW)
        arc_img.setProgress(130f)
        arc_img.setProgress(progress)
        arc_img.setProgressWithAnimation(progress)
```

## How to contribute?

1. Fork the repository 
2. Do the desired changes (add/delete/modify)
3. Make a pull request

## When to contribute?

1. Fix open bugs.
2. Add new issue.


LICENCE
-----

 Copyright 2021 Manish

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 Thanks to Ankit

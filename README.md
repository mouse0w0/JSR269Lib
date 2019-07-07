# JSR269Lib
[![](https://jitpack.io/v/Mouse0w0/JSR269Lib.svg)](https://jitpack.io/#Mouse0w0/JSR269Lib)
A Java library provide some utilities for JSR269 Pluggable Annotation Processing API

## How to use

Step 1. Add the JitPack repository to your build file

Maven:
```xml
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

Maven:
```xml
	<dependency>
	    <groupId>com.github.Mouse0w0</groupId>
	    <artifactId>JSR269Lib</artifactId>
	    <version>Tag</version>
	</dependency>
```

Gradle:
```gradle
	dependencies {
	        implementation 'com.github.Mouse0w0:JSR269Lib:Tag'
	}
```

Step 3. Add the processor for initializing environment

Add `com.github.mouse0w0.jsr269lib.EnvironmentInitializer` to your `javax.annotation.processing.Processor` file:

META-INF/services/javax.annotation.processing.Processor
```
com.github.mouse0w0.jsr269lib.EnvironmentInitializer
...
```

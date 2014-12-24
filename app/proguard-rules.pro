# Butterknife
-dontwarn butterknife.internal.**
-keep class **$$ViewInjector { *; }
-keepnames class * { @butterknife.InjectView *;}

# Retrofit, OkHttp, Gson
-keepattributes *Annotation*
-keepattributes Signature
-keep class com.squareup.okhttp.** { *; }
-keep interface com.squareup.okhttp.** { *; }
-dontwarn com.squareup.okhttp.**
-dontwarn rx.**
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keepclasseswithmembers class * {
    @retrofit.http.* <methods>;
}
-keep class sun.misc.Unsafe { *; }
-dontwarn java.nio.file.*
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement

# Dagger
-keep class * extends dagger.internal.Binding
-keep class * extends dagger.internal.ModuleAdapter
-keep class * extends dagger.internal.StaticInjection﻿
-keep class * extends dagger.internal.BindingsGroup
-dontwarn dagger.internal.**

# scribe / joda
-dontwarn javax.xml.bind.DatatypeConverter
-dontwarn org.apache.commons.codec.binary.Base64

# maps
-keep class com.google.android.gms.maps.** { *; }
-keep interface com.google.android.gms.maps.** { *; }
-dontwarn com.google.android.gms.maps.MapView
-dontwarn com.google.android.gms.map.MapsInitializer
-dontwarn com.google.android.gms.maps.model.LatLng
-dontwarn com.google.android.gms.maps.MapsInitializer

# joda
-dontwarn org.joda.time.DateTime
-dontwarn org.joda.time.LocalDate
-dontwarn org.joda.time.format.ISODateTimeFormat

-keepclassmembers class ** {
    public void onEvent*(**);
}

-keep class com.thisisnotajoke.lockitron.model.** { *; }
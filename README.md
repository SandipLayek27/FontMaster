# FontMaster
```sh
It's a Font Library, which provide 118 fonts....
User can change TextView and EditText font style using this fonts.
Uses of this font library is too simple
```
## Developed
[![Sandip](https://avatars1.githubusercontent.com/u/31722942?v=4&u=18643bfaaba26114584d27693e9891db26bcb582&s=39) Sandip](https://github.com/SandipLayek27)  

# ★ Screen
![alt text](https://raw.githubusercontent.com/SandipLayek27/FontMaster/master/masterfontlibrary/screens/screen.png)

# ★ Gradle Dependency
Add Gradle dependency in the build.gradle file of your application module (app in the most cases) :
First Tab:

```sh
allprojects{
    repositories{
        jcenter()
        maven {
            url 'https://jitpack.io'
        }
    }
}
```

AND

```sh
dependencies {
    compile 'com.github.SandipLayek27:FontMaster:1.1'
}
```
# ★ Font Name.
```sh
AclonicaRegular.ttf
ArimoBold.ttf
ArimoBoldItalic.ttf
ArimoItalic.ttf
ArimoRegular.ttf
CalligraffittiRegular.ttf
CherryCreamSodaRegular.ttf
ChewyRegular.ttf
ComingSoonRegular.ttf
CousineBold.ttf
CousineBoldItalic.ttf
CousineItalic.ttf
CousineRegular.ttf
CraftyGirlsRegular.ttf
CrushedRegular.ttf
FontdinerSwankyRegular.ttf
HomemadeAppleRegular.ttf
IrishGroverRegular.ttf
JsMathCmbx.ttf
JsMathCmex.ttf
JsMathCmmi.ttf
JsMathCmsy.ttf
JsMathCmti.ttf
JustAnotherHandRegular.ttf
KrankyRegular.ttf
LuckiestGuyRegular.ttf
lato_black.ttf
lato_black_italic.ttf
lato_bold.ttf
lato_bold_ltalic.ttf
lato_italic.ttf
lato_light.ttf
lato_light_italic.ttf
lato_regular.ttf
lato_thin.ttf
lato_thin_italic.ttf
MaidenOrangeRegular.ttf
MontezRegular.ttf
MountainsofChristmasBold.ttf
mountainsof_christmas_regular.ttf
NokoraBold.ttf
NokoraRegular.ttf
OpenSans-LightItalic.ttf
OpenSansBold.ttf
OpenSansBoldltalic.ttf
OpenSansCondensedBold.ttf
OpenSansCondensedLight.ttf
OpenSansCondensedLightItalic.ttf
OpenSansExtraBold.ttf
OpenSansExtraBoldLtalic.ttf
OpenSansHebrewBold.ttf
openSansHebrewBoldItalic.ttf
OpenSansHebrewCondensedBold.ttf
OpenSansHebrewCondensedBoldItalic.ttf
OpenSansHebrewCondensedExtraBold.ttf
OpenSansHebrewCondensedExtraBoldItalic.ttf
OpenSansHebrewCondensedItalic.ttf
OpenSansHebrewCondensedLight.ttf
OpenSansHebrewCondensedLightItalic.ttf
OpenSansHebrewCondensedRegular.ttf
OpenSansHebrewExtraBold.ttf
OpenSansHebrewExtraBoldItalic.ttf
OpenSansHebrewItalic.ttf
OpenSansHebrewLight.ttf
OpenSansHebrewLightItalic.ttf
OpenSansHebrewRegular.ttf
OpenSansItalic.ttf
OpenSansLight.ttf
OpenSansRegular.ttf
OpenSansSemiBold.ttf
OpenSansSemiBoldItalic.ttf
PermanentMarkerRegular.ttf
RanchoRegular.ttf
RedressedRegular.ttf
RobotoBlack.ttf
RobotoBlackItalic.ttf
RobotoBold.ttf
RobotoBoldItalic.ttf
RobotoCondensedBold.ttf
RobotoCondensedBoldItalic.ttf
RobotoCondensedItalic.ttf
RobotoCondensedLight.ttf
RobotoCondensedLightItalic.ttf
RobotoCondensedRegular.ttf
RobotoItalic.ttf
RobotoLight.ttf
RobotoLightItalic.ttf
RobotoMedium.ttf
RobotoMediumItalic.ttf
RobotoMonoBold.ttf
RobotoMonoBoldItalic.ttf
RobotoMonoItalic.ttf
RobotoMonoLight.ttf
RobotoMonoLightItalic.ttf
RobotoMonoMedium.ttf
RobotoMonoMediumItalic.ttf
RobotoMonoRegular.ttf
RobotoMonoThin.ttf
RobotoMonoThinItalic.ttf
RobotoRegular.ttf
RobotoSlabBold.ttf
RobotoSlabLight.ttf
RobotoSlabRegular.ttf
RobotoSlabThin.ttf
RobotoThin.ttf
RobotoThinItalic.ttf
RochesterRegular.ttf
RockSaltRegular.ttf
SatisfyRegular.ttf
SchoolbellRegular.ttf
SlackeyRegular.ttf
SmokumRegular.ttf
SpecialEliteRegular.ttf
SunshineyRegular.ttf
SyncopateBold.ttf
SyncopateRegular.ttf
TinosBold.ttf
TinosBoldItalic.ttf
TinosItalic.ttf
TinosRegular.ttf
UltraRegular.ttf
UnkemptBold.ttf
UnkemptRegular.ttf
WalterTurncoatRegular.ttf
YellowtailRegular.ttf
SolaimanLipiBengali.ttf
SolaimanLipi_bengali.ttf
SolaimanLipi_Bold_Bengali.ttf
```
# ★ Uses of this features.
```sh
Uses just call TextView or EditText with fontStyleName.
No Java Command Required.

[ Added To ]:-
steings.xml
<string name="text_of_title">ঘূর্ণিঝড়</string>
-------------------------------------------------------------------------------------
❆ activity_main.xml PAGE:-
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.app.fontmaster.MainActivity">
    <com.fontmaster.app.masterfontlibrary.textview.Custom_TextView_OpenSansRegular
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_TextView_RobotoBlack
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_TextView_RanchoRegular
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_TextView_SatisfyRegular
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_Text_View_IrishGroverRegular
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_Text_View_CrushedRegular
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginBottom="5dp"/>
    <com.fontmaster.app.masterfontlibrary.textview.Custom_TextView_SolaimanLipiBengali
        android:textColor="#000000"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/text_of_title"
        android:layout_marginBottom="5dp"/>
</LinearLayout>
----------------------------------------------------------------------------------------------------------
```

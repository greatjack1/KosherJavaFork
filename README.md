KosherJava (Wyre corp fork) Zmanim API
=====================
Please note this is a fork of the kosher java library configured to use the new Java 8 Date & Time Api's.

This is a passive (hacky) fork in the sense that none of the calculations were changed, only the return types and arguments. Internally the two types Date & LocalDateTime are converted using the DateConverter class in the util package.

All credit for the original Kosher Java goes to Eliyahu Hershfeld, creator of the most awesome & original Kosher Java Package.

This fork is maintained by Yaakov @ The WYRE Corp.

This will remain a fork unless Eliyahu has an interest in merging this into the main Kosher Java project. I doubt this will happen anytime soon since the new java.time api requires java 8, and currently kosher java targets all the way back to java 1.5, therefore this will remain a fork for the time being.

Since this is a fork of KosherJava any contributions to the core zmanim functions should be made to the original KosherJava project unless it has to do with the new Api's. I will try to maintain parity with The original Kosher Java so that your contributions will also work over here.

For any comment and complaints feel free to contact the maintainer at steeltoejava at (googles mail service name) .com

====================
The following section is adapted from the original Kosher Java Library.

Please note that everything in the api documentation should still apply besides for the fact that all Date arguments and return types have been switched to LocalDateTime.

If you need help converting between the two, checkout the two static methods in the DateConverter class in the Util Package.
 
The Zmanim library is an API for a specialized calendar that can calculate different astronomical
times including sunrise and sunset and Jewish _zmanim_ or religious times for prayers and other
Jewish religious dutuies.

These classes extend GregorianCalendar and can therefore
use the standard Calendar functionality to change dates etc. For non religious astronomical / solar
calculations use the [AstronomicalCalendar](./src/net/sourceforge/zmanim/AstronomicalCalendar.java).

The ZmanimCalendar contains the most common zmanim or religious time calculations. For a much more
extensive list of _zmanim_ use the ComplexZmanimCalendar.
This class contains the main functionality of the Zmanim library.

For a basic set of instructions on the use of the API, see [How to Use the Zmanim API](http://www.kosherjava.com/zmanim-project/how-to-use-the-zmanim-api/), [zmanim code samples](http://www.kosherjava.com/tag/code-sample/) and the [KosherJava FAQ](http://www.kosherjava.com/tag/faq/).

License
-------
The library is released under the [LGPL 2.1 license](http://www.kosherjava.com/2011/05/09/kosherjava-zmanim-api-released-under-the-lgpl-license/).

Web Api
------------------------
There is a web api that returns json or xml and is based on the .NET port. It is available at https://wyrezmanim.herokuapp.com

Source code for the web api if you would like to self host is at https://github.com/greatjack1/dotnetcoreZmanim

Disclaimer:
-----------
We do not take any responsibility in using these zmanim halacha lemaisah. Please audit the  source code and calculations yourself before using.

# Cloyd Smart Home Monitor System Java Desktop Client
This is the desktop client for my Smart Home Monitor System. It was written in Java and designed to monitor the DHT22 (temperature and humidity) and MQ-7 (carbon monoxide) sensors in our house via the Cloud MQTT anywhere in the world. [Click this link for the Smart Home Monitor and Android application client](https://github.com/ccatanaoan/HomeTempHumidityMonitor).

I used two pairs of ESP8266 microcontroller to power, control, and read the DHT22 and the MQ-7 sensors. This desktop client, Android application, and the four microcontrollers subscribe to their own topics and publish payloads (MQTT) to communicate and sync up with each other.

This project has started as a simple home weather station but turned in to a full-blown smart home monitoring system. :+1:

The ESP8266 WiFi Module is a self contained system on chip (SoC) with integrated TCP/IP protocol stack that can give any microcontroller access to the WiFi network.

### Data sent from the sensors at home to the desktop client app via the Cloud MQTT
- Carbon monoxide level in parts per million (ppm)
- Air quality based on ppm level
- Temperature
- Relative humidity
- Heat index
- Dew point
- Thermal comfort:
  - Empiric comfort function based on comfort profiles(parametric lines)
  - Multiple comfort profiles possible. Default based on [Cooling/Comfort](https://c03.apogee.net/contentplayer/?coursetype=ces&utilityid=duquesnelight&id=1347)
  - Determine if it's too cold, hot, humid, dry, based on current comfort profile
  - More info at [Determining Thermal Comfort Using a Humidity and Temperature Sensor](https://www.azosensors.com/article.aspx?ArticleID=487)
- Human perception based on humidity, temperature and dew point according to Horstmeyer, Steve (2006-08-15). [Relative Humidity....Relative to What? The Dew Point Temperature...a better approach](http://www.shorstmeyer.com/wxfaqs/humidity/humidity.html)

### Hardware used for Internet of Things (IoT):
* NodeMcu LUA WIFI Board Based on ESP8266 CP2102 Module
* DHT22 (AM2302) Temperature & Humidity Sensor Module
* MQ-7 Carbon Monoxide Sensor
* Wyze Cam V2 and Pan PTZ

### Desktop application and protocols used for Internet of Things (IoT):
- Custom-made Java desktop application
- Cloud MQTT
- [Click this link for the Smart Home Monitor and Android application client](https://github.com/ccatanaoan/HomeTempHumidityMonitor)

### Hardware images:
Description | Image
--------|------
Powerful ESP8266 microcontrollers | ![Image 2](Images/2.jpg) 
MQ7 (Carbon monoxide) and DHT22 (Temp & humidity) sensors | ![Image 3](Images/3.jpg)

### Java Desktop (MS Windows) application image:

![Image 1](Images/1.png)
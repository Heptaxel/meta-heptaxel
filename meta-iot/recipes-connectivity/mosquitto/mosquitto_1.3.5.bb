SUMMARY = "Mosquitto is an open source message broker that implements the MQTT"
DESCRIPTION = "Mosquitto is an open source (BSD licensed) message broker that \
implements the MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT \
provides a lightweight method of carrying out messaging using a publish/subscribe \
model. This makes it suitable for "machine to machine" messaging such as with \
low power sensors or mobile devices such as phones, embedded computers or \
microcontrollers like the Arduino."
HOMEPAGE = "http://mosquitto.org/"
SECTION = "net/misc"
PV = "1.3.5"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=89aa5ea5f32e4260d84c5d185ee3add4 \
"

SRC_URI = "http://mosquitto.org/files/source/mosquitto-1.3.5.tar.gz \
"

SRC_URI[md5sum] = "55094ad4dc7c7985377f43d4fc3d09da"
SRC_URI[sha256sum] = "16eb3dbef183827665feee9288362c7352cd016ba04ca0402a0ccf857d1c2ab2"

DEPENDS = "c-ares"

do_install() {
	oe_runmake install DESTDIR=${D} prefix=/usr
}

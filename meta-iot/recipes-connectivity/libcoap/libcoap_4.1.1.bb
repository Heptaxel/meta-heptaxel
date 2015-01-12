SUMMARY = "A C implementation of IETF Constrained Application Protocol (RFC 7252)"
DESCRIPTION = "Libcoap provides an implementation of the IETF CoAP protocol"
HOMEPAGE = "http://sourceforge.net/projects/libcoap/"
SECTION = "libs/network"
SRCREV = "d48ab449fd05801e574e4966023589ed7dac500b"
# Lookout for PV bump too when SRCREV is changed
PV = "4.1.1+git${SRCPV}"
LICENSE = "GPL | BSD"
LIC_FILES_CHKSUM = "file://${S}/LICENSE.BSD;md5=1164f52f9c4db2c13f681b201010d518 \
                    file://${S}/LICENSE.GPL;md5=4641e94ec96f98fabc56ff9cc48be14b"

S = "${WORKDIR}/git"

SRC_URI = "git://git.code.sf.net/p/libcoap/code \
"

inherit autotools-brokensep

OECONF_EXTRA += "with-shared"

SUMMARY = "Unix Domain socket library"
DESCRIPTION = "libsocket library for Unix Domain Socket and TCP socket communication"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/dermesser/libsocket;protocol=https;branch=master"

S = "${WORKDIR}/git"

SRCREV = "${AUTOREV}"

# On Linux, all static libraries should contain version.
# Non-versioned libs are treated as debug or development packages
# so, suppress QA warning
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

inherit cmake

EXTRA_OECMAKE = ""

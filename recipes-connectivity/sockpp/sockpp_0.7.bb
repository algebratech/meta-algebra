SUMMARY = "C++ socket library"
DESCRIPTION = "sockpp library for Unix Domain Socket and TCP socket communication"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/fpagliughi/sockpp;protocol=https;tag=v0.7"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

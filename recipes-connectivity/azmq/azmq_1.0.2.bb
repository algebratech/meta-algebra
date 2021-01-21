DESCRIPTION = "C++ bindings for ZeroMQ"
HOMEPAGE = "http://www.zeromq.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "zeromq boost"

SRC_URI = "git://github.com/zeromq/azmq;protocol=https"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

PACKAGES = "${PN}-dev"

RDEPENDS_${PN}-dev = "zeromq-dev"

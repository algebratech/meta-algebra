DESCRIPTION = "C++ bindings for ZeroMQ"
HOMEPAGE = "http://www.zeromq.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "zeromq"

SRC_URI = "git://github.com/zeromq/cppzmq;protocol=https"

SRCREV = "18db4568f9ff1568193d3a496d87bed4bc9ec59e"

S = "${WORKDIR}/git"

inherit cmake

# EXTRA_OECMAKE = "-DCPPZMQ_BUILD_TESTS=OFF"
EXTRA_OECMAKE = ""

PACKAGES = "${PN}-dev"

RDEPENDS_${PN}-dev = "zeromq-dev"

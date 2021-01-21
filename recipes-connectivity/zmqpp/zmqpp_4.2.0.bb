DESCRIPTION = "C++ bindings for ZeroMQ"
HOMEPAGE = "http://www.zeromq.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "zeromq"

SRC_URI = "git://github.com/zeromq/zmqpp;protocol=https;branch=develop"

SRCREV = "85ae96020f2376c53d2176e04e88e8e51021b748"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

INSANE_SKIP_${PN}-dev += "dev-elf"

PACKAGES = "${PN}-dev ${PN}-staticdev ${PN}-dbg"

RDEPENDS_${PN}-dev = "zeromq-dev"

FILES_${PN}-dbg = "${libdir}/.debug/*"
